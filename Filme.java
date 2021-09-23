public class Filme {
    //nome da classe
    private int codigo;
    //descrição tipo int do código
    private String nome;
    //descrição nome
    private double valor;
    //descrição double do valor
    private boolean disponivel;
    //descrição boolean se disponível
    
    public int getCodigo(){
        return codigo;
        //get faz a consulta
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
        //set faz a alteração
    }
    public String getNome(){
        return nome;
        //get faz a consulta
    }
    public void setNome(String nome){
        this.nome = nome;
        //set faz a alteração
    }
    public double getValor(){       
        return  valor;
        //get faz a consulta
    }
    public void setValor(double valor){
        this.valor = valor;
        //set faz a alteração
    }
    public boolean isDisponivel(){
        return  disponivel;
        //descreve o valor 
    }
    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
        //set faz a alteração
    }
    public void retirar(){
        if(disponivel == true){
            disponivel = false;
        }else{
            throw new RuntimeException("Este filme não esta disponível par locação");
        }
    }
    public void devolver(){
        disponivel = true;
    }
    public void mostrar(){
        System.out.println("Código do filme:"+ this.codigo);
        System.out.println("Nome do filme:"+ this.nome);
        System.out.println("Valor:R$"+ this.valor);
        System.out.println("Disponivel:"+ this.disponivel);
    }
} 