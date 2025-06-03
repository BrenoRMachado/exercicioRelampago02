public class Escolaridade {

    private String posGraduacao;

    Escolaridade(String posGraduacao)
    {
        setPosGraduacao(posGraduacao);
    }

    public String getPosGraduacao() {
        return this.posGraduacao;
    }

    public void setPosGraduacao(String posGraduacao) {
        if(!posGraduacao.equalsIgnoreCase("DOUTORADO") && !posGraduacao.equalsIgnoreCase("MESTRANDO"))
        {
            throw new IllegalArgumentException("A graduação deve ser doutorado ou mestrado");
        }
        this.posGraduacao = posGraduacao;
    }
}
