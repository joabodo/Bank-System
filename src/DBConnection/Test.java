package DBConnection;


public class Test {
    public static void  main(String[] args){
    DBConnect dbc=new StudentDBOperations();
    dbc.getConnection();
    //dbc.selectOperation("147775");
    //dbc.insertOperation("Shalom","7788","10000","167775");
    //dbc.updateOperation("Bob",147775);
    //dbc.deleteOperation(167775);

}
}