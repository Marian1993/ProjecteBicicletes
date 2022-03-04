package bicicletes.backendprivate.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControler {

    @GetMapping("/")
    public String getHome(){
        return "AdminPaginaPrincipal";
    }

    @GetMapping("/historial-usuaris")
    public String getHistorialUsuaris(){
        return "AdminHistorialUsuarisRegistrats";
    }

    @GetMapping("/historial-productes")
    public String getHistorialProductes(){
        return "AdminHistorialProductes";
    }

    @GetMapping("/sobre-nosaltres")
    public String getInformacioEmpresa(){
        return "AdminInformacioEmpresa";
    }

    @GetMapping("/formulari-lloguer")
    public String getFormPagament(){
        return "AdminProductPaymentForm";
    }

    @GetMapping("/valoracions")
    public String getValoracions(){
        return "AdminValoracions";
    }

    @GetMapping("/historial-usuaris/registrar")
    public String getRegistreUsuari(){
        return "AdminPaginaRegistre";
    }

    @GetMapping("/historial-usuaris/modificar")
    public String getModificarUsuari(){
        return "AdminModificarUsuari";
    }

}
