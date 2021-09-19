public class Programa{
    public static void main(String args[]){
        Filme f = new Filme();
        f.setCodigo(123);
        f.setNome("A era deo gelo");
        
        f.setValor(2.50);
        
        f.devolver();
       
        f.retirar();
       
        f.mostrar();
        
        try{
            f.retirar();

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}