package mx.com.sky.sel.services.ctacelsky;

import javax.ejb.Remote;

import mx.com.sky.sel.dto.ConsultarCtaCelSkyRequestDTO;
import mx.com.sky.sel.dto.ConsultarCtaCelSkyResponseDTO;

@Remote
public interface ServicioCtaSkyCelPSManagement {
    public ConsultarCtaCelSkyResponseDTO consultarCuenta(ConsultarCtaCelSkyRequestDTO request);
}
