package application.models;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
@Table(name = "livro")

public class Autor{

    private int id;
    private String título;

    public void setTítulo(String título){
        this.título= título
    }

    public String getTítulo(){
        return título;
    }

    public void setId(Int id){
        this.id = id

    }

    public int getId(){
        return id;
    }
}
@ManyToOne
@JoinColumn(name ='id_autor')
private Autor autor;

public void setAutor(Autor autor){
    this.autor = autor;
}

public Autor getAutor(){
    return autor 
}

@ManyToOne
@JoinColumn(name = "id_genero")
private Genero genero;

public void setGenero(Genero genero){
    this.genero = genero;
}
public Genero getGenero(){
    return genero;
}
