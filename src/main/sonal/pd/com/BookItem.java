package main.sonal.pd.com;

public class BookItem {
    private final int id;
    private final int rackNo;
    private StatusBookItem status;

    public BookItem(int id, int rackNo, StatusBookItem status) {
        this.id = id;
        this.rackNo = rackNo;
        this.status = status;
    }
    public void updateBookItemStatus(StatusBookItem statusBookItem){
        status=statusBookItem;
    }
    public StatusBookItem getStatus(){
        return status;
    }
}
