package com.leocastillo.worldpc;

public class Order {
    private final int idOrden;
    private Computer computers[];
    private static int countOrder;
    private static int MAX_COMPUTERS = 10;
    private  int countComputer;

    public Order()
    {
        this.idOrden = ++Order.countOrder;
        this.computers = new Computer[Order.MAX_COMPUTERS];
    }

    public void addComputer(Computer computer)
    {
        if(this.countComputer < Order.MAX_COMPUTERS)
        {
            this.computers[this.countComputer++] = computer;
        }
        else
        {
            System.out.println("Superaste el límite: " + Order.MAX_COMPUTERS);
        }
    }

    public void showOrder()
    {
        System.out.println("Orden #:" + this.idOrden);
        System.out.println("Computadoras de la orden #:" + this.idOrden);
        for(int i = 0; i < this.countComputer; i++)
        {
            System.out.println(this.computers[i]);
        }
    }
}
