
package problema.pkg2_alquilerpeliculas;

public class Peliculas {
    private String título;
    private String autor; 
    private int añoEdición;
    private String idioma;
   
    public Peliculas(String título, String autor, int añoEdición, String idioma) {
        this.título = título;
        this.autor = autor;
        this.añoEdición = añoEdición;
        this.idioma= idioma;
    }

    
    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoEdición() {
        return añoEdición;
    }

    public void setAñoEdición(int añoEdición) {
        this.añoEdición = añoEdición;
    }
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
