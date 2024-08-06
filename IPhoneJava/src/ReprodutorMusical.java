import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {
    private boolean pausado = true;
    private final List<String> playlist = new ArrayList<String>();
    private String musicaSelecionada;

    public ReprodutorMusical(){
        playlist.add("Musica 1");
        playlist.add("Musica 2");
        playlist.add("Musica 3");
    }

    public void tocar(){
        if (pausado){
            pausado = false;
            System.out.println("Tocando música " + musicaSelecionada);
        }
    }

    public void pausar(){
        if (!pausado){
            pausado = true;
            System.out.println("Pausando música " + musicaSelecionada);
        }
    }

    public void selecionarMusica(String musica){
        for (String m : playlist){
            if(musica.equalsIgnoreCase(m)){
                musicaSelecionada = m;
            }
        }
        System.out.println("Música " + musicaSelecionada + " Selecionada.");
    }
}