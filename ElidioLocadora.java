public class Filme{
    private in codigo;
    private String nome;
    private double valor;
    private boolean disponivel;
    
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(in codigo){
        this.codigo = codigo;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getValor(){
        return = valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public boolean getDisponivel(){
        return = disponivel;
    }
    public void setDisponivel(boolean disponivel){
        this.disponevel = disponivel;
    }
    public void retirar(){
        if(disponivel == true){
            disponevel = false;
        }else{
            throw new RuntimeException("Este filme não esta disponível par locação");
        }
    }
    public void devolver(){
        disponevel = true;
    }
    public void mostra(){
        System.out.println("Código do filme:"+ this.codigo);
        System.out.println("Nome do filme:"+ this.nome);
        System.out.println("Valor:R$"+ this.valor);
        System.out.println("Disponivel:"+ this.disponevel);
    }
} 