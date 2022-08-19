package mx.com.sky.sel.enums;

/**
 * EFECTIVO - Efectivo
 * TDC  - Tarjeta de Credito
 * TDD  - Tarjeta de Debito
 * TDP  - Tarjeta de Prepago
 * TDC_TDD  - TDC y TDD
 * EFEC_TDC - Efectivo y TDC
 * EFEC_TDD - Efectivo y TDD
 * TODAS    - Todas las formas de pago
 * NA       - No encontrada
 */
public enum EnumFormaPago {
    EFECTIVO,TDC,TDD,TDC_TDD,EFEC_TDC,EFEC_TDD,TODAS,NA,TDP;
    private static final long serialVersionUID = 1L;
}
