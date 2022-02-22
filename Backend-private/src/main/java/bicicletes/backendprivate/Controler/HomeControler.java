package bicicletes.backendprivate.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControler {

    @GetMapping("/")
    public String getHome(){
        return "home";
    }

    @GetMapping("/bicicletes")
    public String getBicicleta(){
        return "bicyclePage";
    }

    @GetMapping("/patinets")
    public String getPatinet(){
        return "rollerSkatePage";
    }

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }

    @GetMapping("/carreto")
    public String getCarreto(){
        return "carreto";
    }

    @GetMapping("/formulari-pagament-treballador")
    public String getFormPagamentTreballador(){
        return "bicyclePaymentForm";
    }

    @GetMapping("/crear-valoracio")
    public String getCrearValoracio(){
        return "createRate";
    }

    @GetMapping("/fitxa-contracte")
    public String getContracte(){
        return "FitxaContracte";
    }

    @GetMapping("/formulari-pagament")
    public String getFormPagament(){
        return "formToPay";
    }

    @GetMapping("/historial")
    public String getHistorialClient(){
        return "HistorialClient";
    }

    @GetMapping("/historial-usuaris")
    public String getHistorialUsuaris(){
        return "historialUsuarisRegistrats";
    }

    @GetMapping("/modificar-usuaris")
    public String getModificarUsuaris(){
        return "modificarEliminarUsuari";
    }

    @GetMapping("/crear-contracte")
    public String getCrearContracte(){
        return "newContracte";
    }

    @GetMapping("/pagina-registre")
    public String getPaginaRegistre(){
        return "paginaRegistre";
    }

    @GetMapping("/historial-productes")
    public String getHistorialProductes(){
        return "ProductesModificarProductes";
    }

}
