package edu.nvcc.csc.csc200.car;

public class carDriver {

    public static void main (String[] args){
        car mycar = new car();
        car hiscar = new car("Honda","Black",3.5,400);
        car hercar = new car ("Ford","pink",2.5,300);
        System.out.println(mycar+"\n");
        System.out.println(hiscar+"\n");
        System.out.println(hercar+"\n");
        System.out.println(hercar.equals(mycar)+"\n");
        System.out.println(hiscar.equals(hercar)+"\n");
        mycar.setColor("Black");
        hiscar.setColor("Black");
        hercar.setColor("Black");

        mycar.setMake("Buick");
        hiscar.setMake("Buick");
        hercar.setMake("Buick");

        mycar.setEngineSize(6.5);
        hiscar.setEngineSize(6.5);
        hercar.setEngineSize(6.5);

        mycar.setHorsePower(650);
        hiscar.setHorsePower(650);
        hercar.setHorsePower(650);

        System.out.println(mycar.getMake()+" " + mycar.getColor()+
                " "+mycar.getEngineSize()+" "+mycar.getHorsePower());
        System.out.println(hiscar.getMake()+" " + hiscar.getColor()+
                " "+hiscar.getEngineSize()+" "+hiscar.getHorsePower());
        System.out.println(hercar.getMake()+" " + hercar.getColor()+
                " "+hercar.getEngineSize()+" "+hercar.getHorsePower());
        System.out.println(hercar.equals(mycar)+"\n");
        System.out.println(hiscar.equals(hercar)+"\n");
        System.out.println("\n"+ car.getCount());
    }



}
