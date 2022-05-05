package db;

import model.*;

import java.util.ArrayList;

public class Database {
    public static ArrayList<Vehicle> vehicleTable=new ArrayList<Vehicle>();

    static {
        vehicleTable.add(
                new Bus("NA-3434","Bus",3500,60)
        );
        vehicleTable.add(
                new Van("KA-4563","Van",1000,7)
        );
        vehicleTable.add(
                new Van("58-3567","Van",1500,4)
        );
        vehicleTable.add(
                new Van("GF-4358","Van",800,4)
        );
        vehicleTable.add(
                new Van("CCB-3568","Van",1800,8)
        );
        vehicleTable.add(
                new Van("LM-6679","Van",1500,4)
        );
        vehicleTable.add(
                new Van("QA-3668","Van",1800,6)
        );
        vehicleTable.add(
                new Lorry("KB-3668","Cargo Lorry",2500,2)
        );
        vehicleTable.add(
                new Lorry("JJ-9878","Cargo Lorry",3000,2)
        );
        vehicleTable.add(
                new Lorry("GH-5772","Cargo Lorry",4000,3)
        );
        vehicleTable.add(
                new Lorry("XY-4456","Cargo Lorry",3500,2)
        );
        vehicleTable.add(
                new Lorry("YQ-3536","Cargo Lorry",2000,2)
        );
        vehicleTable.add(
                new Lorry("CBB-3566","Cargo Lorry",2500,2)
        );
        vehicleTable.add(
                new Lorry("QH-3444","Cargo Lorry",5000,4)
        );
    }


    public static ArrayList<Driver> driverTable=new ArrayList<Driver>();
    static {
        driverTable.add(
                new Driver("Sumith Kumara","7835348345V","B6474845","0725637456","Panadura")
        );
        driverTable.add(
                new Driver("Amila Pathirana","8826253734V","B3354674 ","0717573583","Galle")
        );
        driverTable.add(
                new Driver("Jithmal Perera","9283289272V","B3674589","0772452457","Horana")
        );
        driverTable.add(
                new Driver("Sumith Dissanayaka","9425245373V","B8366399","0782686390","Kaluthara")
        );
        driverTable.add(
                new Driver("Sumanasiri Herath ","8976544373V","B3537538","0772534436","Beruwala")
        );
        driverTable.add(
                new Driver("Awantha Fernando","9173537839V","B3554789","0714534356","Colombo 5 ")
        );
        driverTable.add(
                new Driver("Charith Sudara","9573536833V","B6835836","0771536662","Baththaramulla ")
        );
        driverTable.add(
                new Driver("Prashan Dineth","9362426738V","B2683536 ","0715353434","Wadduwa")
        );
        driverTable.add(
                new Driver("Chethiya Dilan","9162353436V","B6836836","0772436737","Panadura")
        );
        driverTable.add(
                new Driver("Dushantha Perera","9255556343V","B3334435","0777245343","Matara")
        );
        driverTable.add(
                new Driver("Sumith Udayanga ","8735354355V","B3573783","0703635442","Galle")
        );
        driverTable.add(
                new Driver("Dinesh Udara ","9026344373V","B5343783","0713456878","Hettimulla")
        );
        driverTable.add(
                new Driver("Udana Chathuranga ","9692653338V","B7888632","0772442444","Kottawa")
        );
        driverTable.add(
                new Driver("Mohommad Riaz","9124537733V","B3638537","0777544222","Kaluthara")
        );
        driverTable.add(
                new Driver("Sandun Kumara","9563524267V","B2263333","0772325544","Panadura")
        );
        driverTable.add(
                new Driver("Priyanga Perera","9135343537V","B3853753","0723344562","Matara")
        );
    }

    public static ArrayList<VehiclesInParking> vehiclesInParkingTable=new ArrayList<VehiclesInParking>();


    public static ArrayList<VehiclesOnDelivery> vehiclesOnDeliveryTable=new ArrayList<VehiclesOnDelivery>();


}
