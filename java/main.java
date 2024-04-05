class main{
public static void main (String []args){
system.out.println ("Inicializando....");
system.out.println ("car...");
Car car = new Car ("AMQ123" , new
Account("Lopez Lopez",
"ADN12345","lopez@hotmail.com","12345"));
car.passenger = 4;
car.printDataCar();

system.out.println("Uber....");
UberX Uberx = new UberX
("MKL185", new Account("Marya layla","JKL12365",
"marya@hotmail.com","125478"),
"NISSAN", "corola");
}
}