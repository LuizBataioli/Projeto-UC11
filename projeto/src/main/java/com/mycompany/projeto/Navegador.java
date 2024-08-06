package com.mycompany.projeto;
import static com.mycompany.projeto.DatabaseConnection.getConnection;
import com.mycompany.projeto.DatabaseConnection;
import com.mycompany.projeto.view.CadastroDoencas;
import com.mycompany.projeto.view.CadastroSintomas;
import com.mycompany.projeto.view.ConexSintomasDoencas;
import com.mycompany.projeto.view.LocalizarDoencaPorSintoma;

public class Navegador {
    private static CadastroSintomas cadastroSintomas;
    private static CadastroDoencas cadastroDoencas;
    private static ConexSintomasDoencas ConexSintomasDoencas;
    private static LocalizarDoencaPorSintoma localizarDoencaPorSintoma;

    public static void mostrarCadastroSintomas() {
        if (cadastroSintomas == null) {
            cadastroSintomas = new CadastroSintomas();
        }
        cadastroSintomas.setVisible(true);
        esconderCadastroDoencas();
    }

    public static void mostrarCadastroDoencas() {
        if (cadastroDoencas == null) {
            cadastroDoencas = new CadastroDoencas();
        }
        cadastroDoencas.setVisible(true);
        esconderCadastroSintomas();
    }

    private static void esconderCadastroSintomas() {
        if (cadastroSintomas != null) {
            cadastroSintomas.setVisible(false);
        }
    }

    private static void esconderCadastroDoencas() {
        if (cadastroDoencas != null) {
            cadastroDoencas.setVisible(false);
        }
    }
    
    public static void mostrarConexSintomasDoencas() {
        if (ConexSintomasDoencas == null) {
            ConexSintomasDoencas = new ConexSintomasDoencas();
        }
        ConexSintomasDoencas.setVisible(true);
        esconderCadastroDoencas();
    }
    
    public static void mostrarLocalizarDoencaPorSintoma() {
        if (localizarDoencaPorSintoma == null) {
            localizarDoencaPorSintoma = new LocalizarDoencaPorSintoma();
        }
        localizarDoencaPorSintoma.setVisible(true);
        esconderCadastroSintomas();
    }

    private static void esconderLocalizarDoencaPorSintoma() {
        if (localizarDoencaPorSintoma != null) {
            localizarDoencaPorSintoma.setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        LocalizarDoencaPorSintoma formLocalizar = new LocalizarDoencaPorSintoma();
        formLocalizar.setVisible(true);
    }
}
