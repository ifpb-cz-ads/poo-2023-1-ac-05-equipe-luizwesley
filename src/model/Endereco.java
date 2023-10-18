package model;
public class Endereco {
    private String rua;
    private int num;
    private String cidade;
    public Endereco(String rua, int num, String cidade) {
        this.rua = rua;
        this.num = num;
        this.cidade = cidade;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
} 