package br.com.cliente.utils;


import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author hugo.gomes
 */
public class MaskCampos {
    
    public MaskFormatter maskTelefone(JFormattedTextField textfield) 
            throws ParseException{
            
        MaskFormatter mask = null; // Criamos o objeto adicionando valor null
        mask = new MaskFormatter("(##)####-####"); // Instaciamos o objeto passando a mascara como parametros
        mask.setOverwriteMode(false); // Informando que não vai aceitar caractere especiais
        mask.setValidCharacters("0123456789"); // Informando para ele aceitar apenas numeros
        //mask.setPlaceholderCharacter('_'); //Informando para ele mascara principal seria o underline
        mask.install(textfield);       //Instalado o objeto no componente
       return mask; // Retornando o objeto
    }
    
    public void maskGeral(JFormattedTextField textfield, String Mascara) throws ParseException{
    
                textfield.setFormatterFactory(
                    new DefaultFormatterFactory(
                            new MaskFormatter(Mascara)));
    }
    
    public MaskFormatter maskCelular(JFormattedTextField textfield) 
            throws ParseException{
            
        MaskFormatter mask = null;
        mask = new MaskFormatter("(##)#####-####");
        mask.setOverwriteMode(false);
        mask.setValidCharacters("0123456789");
       // mask.setPlaceholderCharacter('_');
        mask.install(textfield);       
       return mask; 
    }

    public MaskFormatter maskCPF(JFormattedTextField textfield) 
            throws ParseException{
            
        MaskFormatter mask = null;
        mask = new MaskFormatter("###.###.###-##");
        mask.setOverwriteMode(false);
        mask.setValidCharacters("0123456789");
        mask.setPlaceholderCharacter('_');
        mask.setMask("###.###.###-##");
        mask.install(textfield);       
       return mask; 
    }

    public MaskFormatter maskCNPJ(JFormattedTextField textfield) 
            throws ParseException{
            
        MaskFormatter mask = null;
        mask = new MaskFormatter("##.###.###/####-##");
        mask.setOverwriteMode(false);
        mask.setValidCharacters("0123456789");
        //mask.setPlaceholderCharacter('_');
        mask.install(textfield);       
       return mask; 
    }
    
    public MaskFormatter maskCEP(JFormattedTextField textfield) 
            throws ParseException{
            
        MaskFormatter mask = null;
        mask = new MaskFormatter("#####-###");
        mask.setOverwriteMode(false);
        mask.setValidCharacters("0123456789");
       // mask.setPlaceholderCharacter('_');
        mask.install(textfield);       
       return mask; 
    }

}
