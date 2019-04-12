import Paginator from "./Paginator.js"
import {createButton} from "./HtmlUtils.js"

        /**
         titolo;
         service;
         idTabella;
         classeTabella;
         contenitore;
         page
         */

export default class Tabella1 {

    constructor(properties) {
        this.prop = properties;
        this.el = document.querySelector(this.prop.contenitore);
        this.rowSelected = null;
        this.onPaginatorClick = this.onPaginatorClick.bind(this);
        this.onRowClick = this.onRowClick.bind(this);
        this.loadData();
    }

    loadData() {
        this.prop.service.all(0, this.prop.page)
                .then(json => {
                    this.data = json.data;
                    this.count = json.count;
                    this.readFields();
                    this.el = document.querySelector(this.prop.contenitore);
                    this.el.innerHtml = this.render(json);
                });
    }

    reloadData() {
        this.prop.service.all((this.paginator.current - 1) * this.paginator.page, this.paginator.page)
                .then(json => {
                    this.data = json.data;
                    this.tbody.innerHTML = "";
                    this.createBody();
                });
    }
    render(json) {
       return `
        <table id="${this.prop.idTabella}" className="${this.prop.classeTabella}">
            <caption>${this.prop.titolo}</caption>
            <thead>
                <tr>${this.fields.map(name => `<th>${name}</th>`).join('')}</tr>
            </thead>
            <tbody>
                ${this.body()}
            </tbody>
            <tfoot>
                <tr>
                    <td colSpan="${this.fields.lenght}">
                        <button>Nuovo</button>
                    </td>
                </tr>
            </tfoot>
        </table>
        
        `
    }

    readFields() {
        const [first] = this.data;
        this.fields = Reflect.ownKeys(first);
    }


    headers() {
        return this.fields.map(name => `<th>${name}</th>`).join('');
    }


    body(){
        return this.data.map(v => this.createRow(v)).join('');
    }

    createRow(rowData) {
        return `
            <tr>${this.fields
                    .map(v => Reflect.get(rowData, v))
                    .map(v => `<td>${v}</td>`).join('')}
            </tr>
        `
    }
    
    createPaginator(col) {
        this.paginator = new Paginator({
            page: this.prop.page,
            count: this.count,
            callback: this.onPaginatorClick
        });
        col.appendChild(this.paginator.first);
        col.appendChild(this.paginator.prev);
        col.appendChild(this.paginator.next);
        col.appendChild(this.paginator.last);
    }

    onRowClick(e) {
        if (this.rowSelected !== null) {
            this.rowSelected.classList.toggle('row-select');
        }
        this.rowSelected = e.target.parentElement;
        this.rowSelected.classList.toggle('row-select');
    }

    onPaginatorClick() {
        this.reloadData();
    }
}


