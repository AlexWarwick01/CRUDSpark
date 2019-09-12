public class ToDo {
    private int id;
    private String content;
    private int labelid;
    public ToDo(int id, String content, int labelid){
        this.content = content;
        this.id = id;
        this.labelid = labelid;
    }
    public int getid(){
        return id;
    }
    public String getContent(){
        return content;
    }
    public int getLabelid(){
        return labelid;
    }
}
