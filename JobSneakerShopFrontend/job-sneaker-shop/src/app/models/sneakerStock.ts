export class SneakerStock {
    modelID: string;
    stockList: Map<String,Number>;

    constructor(modelID:string, stockList: Map<String,Number>) {
        this.modelID = modelID;
        this.stockList = stockList;
    }
}