package mx.com.sky.sel.services.ctacelsky;

import javax.ejb.Local;

import mx.com.sky.sel.dto.ConsultarCtaCelSkyRequestDTO;
import mx.com.sky.sel.dto.ConsultarCtaCelSkyResponseDTO;

@Local
public interface ServicioCtaSkyCelPSManagementLocal {
    public ConsultarCtaCelSkyResponseDTO consultarCuenta(ConsultarCtaCelSkyRequestDTO request);
}
