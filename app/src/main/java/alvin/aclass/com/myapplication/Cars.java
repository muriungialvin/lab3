package alvin.aclass.com.myapplication;

/**
 * Created by muriu on 10/24/2017.
 */

public class Cars {
    //private variables
    private int _id;
    private String _make;
    private String _model;

    //empty constructor
    public Cars(){

    }

    //constructor
    public Cars(int id, String make, String _model){
        this._id = id;
        this._make = make;
        this._model = _model;
    }

    //constructor
    public Cars(String make, String _model){
        this._make = make;
        this._model = _model;
    }

    //getting ID
    public int getID(){
        return this._id;
    }

    //setting ID
    public void setID(int id){
        this._id = id;
    }
    //getting name
    public String getMake(){
        return this._make;
    }
    //setting name
    public void setMake(String make){
        this._make = make;
    }
    //getting phone number
    public String getModel(){
        return this._model;
    }
    //setting phone number
    public void setModel(String model){
        this._model = model;
    }

}
