package mezzoDiTrasporto;

public class MezzoDiTrasporto {
    private Float COEFF_CONV_DA_CV_A_KW = 0.738f;
    private Integer cavalli;
    private String marca;
    protected int numeroIstanze;

    public MezzoDiTrasporto(){
        numeroIstanze++;
    }

    public MezzoDiTrasporto(Integer cavalli, String marca){
        this.cavalli=cavalli;
        this.marca=marca;
        numeroIstanze++;
    }

    public Integer getCavalli() {
        return cavalli;
    }

    public void setCavalli(Integer cavalli) {
        this.cavalli = cavalli;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroIstanze() {
        return numeroIstanze;
    }


    public Integer calcolaKw(){
        return Math.round(cavalli * COEFF_CONV_DA_CV_A_KW);
    }


    public String info() {
        return "MezzoDiTrasporto{" +
                "cavalli=" + cavalli +
                ", marca='" + marca + '\'' +
                '}';
    }
}
