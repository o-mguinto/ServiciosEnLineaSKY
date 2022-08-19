package mx.com.sky.sel.services.cybersource.billetera;

import java.util.List;

import javax.ejb.Remote;

import mx.com.sky.sel.services.beans.billetera.ActualizarTDCBilleteraResponseDTO;
import mx.com.sky.sel.services.beans.billetera.RequestGenerarIdUnicoDePagoDTO;
import mx.com.sky.sel.services.beans.billetera.RequestOrquestarProcesoPagoDTO;
import mx.com.sky.sel.services.beans.billetera.ResponseGenerarIdUnicoDePagoDTO;
import mx.com.sky.sel.services.beans.billetera.ResponseOrquestarProcesoPagoDTO;
import mx.com.sky.sel.services.beans.billetera.TarjetaBilletera;
import mx.com.sky.sel.services.beans.billetera.TokenDTO;
import mx.com.sky.sel.services.beans.cybersource.CambiarFormaDePagoRequestDTO;
import mx.com.sky.sel.services.beans.cybersource.CambiarFormaDePagoResponseDTO;
import mx.com.sky.sel.services.beans.cybersource.ConsultarProductoRequestDTO;
import mx.com.sky.sel.services.beans.cybersource.ConsultarProductoResponseDTO;
import mx.com.sky.sel.services.beans.cybersource.ConsultarTipoCambioRequestDTO;
import mx.com.sky.sel.services.beans.cybersource.ConsultarTipoCambioResponseDTO;
import mx.com.sky.sel.services.beans.cybersource.DeterminarComercioRequestDTO;
import mx.com.sky.sel.services.beans.cybersource.DeterminarComercioResponseDTO;
import mx.com.sky.sel.services.beans.cybersource.EliminarMetodoDePagoRequestDTO;
import mx.com.sky.sel.services.beans.cybersource.EliminarMetodoDePagoResponseDTO;
import mx.com.sky.sel.services.beans.cybersource.GenerarURLBilleteraRequestDTO;

@Remote
public interface BilleteraManagement {
    public List<TarjetaBilletera> consultarBilletera(String CuentaSKY);
    public String generarURLBilletera(GenerarURLBilleteraRequestDTO request);
    public EliminarMetodoDePagoResponseDTO eliminarMetodoDePago(EliminarMetodoDePagoRequestDTO requestDTO);
    public ConsultarProductoResponseDTO consultarProducto(ConsultarProductoRequestDTO reqConsultarProducto);
    public ConsultarTipoCambioResponseDTO consultarTipoCambio(ConsultarTipoCambioRequestDTO reqTipoCambio);
    public DeterminarComercioResponseDTO determinarComercio(DeterminarComercioRequestDTO reqDeterminarCom);
    public ResponseGenerarIdUnicoDePagoDTO generarIdUnicoDePago(RequestGenerarIdUnicoDePagoDTO reqGenIdUnicoP);
    public ActualizarTDCBilleteraResponseDTO actualizarTDCBilletera(TokenDTO requestDTO);
    public ResponseOrquestarProcesoPagoDTO orquestarProcesoPago(RequestOrquestarProcesoPagoDTO requestDTO);
    public CambiarFormaDePagoResponseDTO cambiarFormaPago(CambiarFormaDePagoRequestDTO reqCambiarFormaPago);
}
