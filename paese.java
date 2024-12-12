public class Paese {
    private String nome;
    private String continente;
    private String popolazione;

    public Paese(String nome, String continente, String popolazione) {
        this.nome = nome;
        this.continente = continente;
        this.popolazione = popolazione;
    }

    public String getNome() {
        return nome;
    }

    public String getContinente() {
        return continente;
    }

    public String getPopolazione() {
        return popolazione;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public void setPopolazione(String popolazione) {
        this.popolazione = popolazione;
    }

    @Override
    public String toString() {
        return "Paese{" +
                "nome='" + nome + '\'' +
                ", continente='" + continente + '\'' +
                ", popolazione='" + popolazione + '\'' +
                '}';
    }
}