
package mx.com.sky.siebelosb.consultacuenta;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ConsultaCuenta_Salida_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultaCuenta_Salida_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CABECERA" type="{http://www.sky.com.mx/SiebelOSB/ConsultaCuenta}Cabecera_Salida_TYPE"/>
 *         &lt;element name="ListOfAccount">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Account" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="AccountStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ServicesNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PreActivateFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="SKYNEWERA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="MarketType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="MarketClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ComInvoiceBillCycle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CustomerSince" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="SKYPromocion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="EstatusVeTV" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="AgreementName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="SKYIdDistributor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="SKYIdMaster" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ParentAccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="LegalStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ComInvoicePaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="AccountTechnology" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="AccountSatellite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="BillPaymentSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="SKYHJFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PrimaryAccountCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ComInvoiceBillPaymentSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="AccountServicesUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="AccountServicesSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="AccountServicesWeighting" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ServicesPackage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="AccountTypeRecharge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ListOfProperty">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Property" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="PropertyValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ListOfServiceInstance">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ServiceInstance" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="SlaveHierarchy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="AssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="SecondAssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="ServiceProductType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="AgreementName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="ServiceSupplier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="EventTypeExtern" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="HouseHoldId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="ListOfInstanceComponent">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="InstanceComponent" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="SKYHJProveedorServicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="ProductCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="EffectiveStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="EffectiveEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="ProductoVencidoFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="DownloadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="UOMDownloadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="UploadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="UOMUploadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="ExternalOffer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ListOfServiceInstanceType">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ServiceInstanceType" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ServiceProductType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="TotalInstancias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Activo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Pendiente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Suspendido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Desconectado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="FutureAddition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="FutureDisconnection" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ListOfServiceAgreement">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ServiceAgreement" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="SubscriptionAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="AgreementNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="AgreementStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="AgreementStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="AgreementType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="CanaldeVentaWEB" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="PlazoForzosoContrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="SKYPaquete" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="SKYPaqueteActivaciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="SKYPlazoForzoso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="SKYRecargaMini" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="SKYPromocion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="SKYPromocionActivaciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="SKYVTVPlazoForzoso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="ServiceFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ListOfAddress">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AccountAddress" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="AddrType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="StreetAddrCalle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="NumInt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="ProvinceColonia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="AddrNumNumExt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="CityPoblacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="CountyDelMun" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="StateEstado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="CountryPais" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="PostalCodeCP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="EntreCalle1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="EntreCalle2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="MDUFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="AddrId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaCuenta_Salida_TYPE", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", propOrder = {
    "cabecera",
    "listOfAccount"
})
public class ConsultaCuentaSalidaTYPE {

    @XmlElement(name = "CABECERA", required = true)
    protected CabeceraSalidaTYPE cabecera;
    @XmlElement(name = "ListOfAccount", required = true)
    protected ConsultaCuentaSalidaTYPE.ListOfAccount listOfAccount;

    /**
     * Gets the value of the cabecera property.
     * 
     * @return
     *     possible object is
     *     {@link CabeceraSalidaTYPE }
     *     
     */
    public CabeceraSalidaTYPE getCABECERA() {
        return cabecera;
    }

    /**
     * Sets the value of the cabecera property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabeceraSalidaTYPE }
     *     
     */
    public void setCABECERA(CabeceraSalidaTYPE value) {
        this.cabecera = value;
    }

    /**
     * Gets the value of the listOfAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaCuentaSalidaTYPE.ListOfAccount }
     *     
     */
    public ConsultaCuentaSalidaTYPE.ListOfAccount getListOfAccount() {
        return listOfAccount;
    }

    /**
     * Sets the value of the listOfAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaCuentaSalidaTYPE.ListOfAccount }
     *     
     */
    public void setListOfAccount(ConsultaCuentaSalidaTYPE.ListOfAccount value) {
        this.listOfAccount = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Account" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="AccountStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ServicesNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PreActivateFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="SKYNEWERA" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="MarketType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="MarketClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ComInvoiceBillCycle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CustomerSince" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="SKYPromocion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="EstatusVeTV" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="AgreementName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="SKYIdDistributor" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="SKYIdMaster" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ParentAccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="LegalStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ComInvoicePaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="AccountTechnology" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="AccountSatellite" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="BillPaymentSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="SKYHJFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PrimaryAccountCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ComInvoiceBillPaymentSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="AccountServicesUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="AccountServicesSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="AccountServicesWeighting" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ServicesPackage" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="AccountTypeRecharge" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ListOfProperty">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Property" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="PropertyValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ListOfServiceInstance">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ServiceInstance" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="SlaveHierarchy" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="AssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="SecondAssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="ServiceProductType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="AgreementName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="ServiceSupplier" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="EventTypeExtern" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="HouseHoldId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="ListOfInstanceComponent">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="InstanceComponent" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="SKYHJProveedorServicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="ProductCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="EffectiveStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="EffectiveEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="ProductoVencidoFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="DownloadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="UOMDownloadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="UploadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="UOMUploadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="ExternalOffer" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ListOfServiceInstanceType">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ServiceInstanceType" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ServiceProductType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="TotalInstancias" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Activo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Pendiente" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Suspendido" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Desconectado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="FutureAddition" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="FutureDisconnection" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ListOfServiceAgreement">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ServiceAgreement" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="SubscriptionAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="AgreementNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="AgreementStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="AgreementStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="AgreementType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="CanaldeVentaWEB" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="PlazoForzosoContrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="SKYPaquete" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="SKYPaqueteActivaciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="SKYPlazoForzoso" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="SKYRecargaMini" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="SKYPromocion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="SKYPromocionActivaciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="SKYVTVPlazoForzoso" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="ServiceFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ListOfAddress">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AccountAddress" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="AddrType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="StreetAddrCalle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="NumInt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="ProvinceColonia" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="AddrNumNumExt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="CityPoblacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="CountyDelMun" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="StateEstado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="CountryPais" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="PostalCodeCP" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="EntreCalle1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="EntreCalle2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="MDUFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="AddrId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "account"
    })
    public static class ListOfAccount {

        @XmlElement(name = "Account", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
        protected List<ConsultaCuentaSalidaTYPE.ListOfAccount.Account> account;

        /**
         * Gets the value of the account property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the account property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConsultaCuentaSalidaTYPE.ListOfAccount.Account }
         * 
         * 
         */
        public List<ConsultaCuentaSalidaTYPE.ListOfAccount.Account> getAccount() {
            if (account == null) {
                account = new ArrayList<ConsultaCuentaSalidaTYPE.ListOfAccount.Account>();
            }
            return this.account;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="AccountStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ServicesNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PreActivateFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="SKYNEWERA" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="MarketType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="MarketClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ComInvoiceBillCycle" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CustomerSince" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="SKYPromocion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="EstatusVeTV" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="AgreementName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="SKYIdDistributor" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="SKYIdMaster" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ParentAccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="LegalStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ComInvoicePaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="AccountTechnology" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="AccountSatellite" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="BillPaymentSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="SKYHJFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PrimaryAccountCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ComInvoiceBillPaymentSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="AccountServicesUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="AccountServicesSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="AccountServicesWeighting" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ServicesPackage" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="AccountTypeRecharge" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ListOfProperty">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Property" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="PropertyValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ListOfServiceInstance">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ServiceInstance" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="SlaveHierarchy" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="AssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="SecondAssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="ServiceProductType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="AgreementName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="ServiceSupplier" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="EventTypeExtern" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="HouseHoldId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="ListOfInstanceComponent">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="InstanceComponent" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="SKYHJProveedorServicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="ProductCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="EffectiveStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="EffectiveEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="ProductoVencidoFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="DownloadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="UOMDownloadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="UploadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="UOMUploadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="ExternalOffer" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ListOfServiceInstanceType">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ServiceInstanceType" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ServiceProductType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="TotalInstancias" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Activo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Pendiente" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Suspendido" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Desconectado" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="FutureAddition" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="FutureDisconnection" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ListOfServiceAgreement">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ServiceAgreement" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="SubscriptionAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="AgreementNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="AgreementStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="AgreementStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="AgreementType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="CanaldeVentaWEB" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="PlazoForzosoContrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="SKYPaquete" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="SKYPaqueteActivaciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="SKYPlazoForzoso" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="SKYRecargaMini" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="SKYPromocion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="SKYPromocionActivaciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="SKYVTVPlazoForzoso" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="ServiceFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ListOfAddress">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AccountAddress" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="AddrType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="StreetAddrCalle" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="NumInt" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="ProvinceColonia" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="AddrNumNumExt" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="CityPoblacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="CountyDelMun" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="StateEstado" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="CountryPais" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="PostalCodeCP" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="EntreCalle1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="EntreCalle2" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="MDUFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="AddrId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "accountNumber",
            "accountStatus",
            "servicesNumber",
            "preActivateFlag",
            "location",
            "skynewera",
            "type",
            "marketType",
            "marketClass",
            "comInvoiceBillCycle",
            "customerSince",
            "skyPromocion",
            "estatusVeTV",
            "agreementName",
            "skyIdDistributor",
            "skyIdMaster",
            "parentAccountName",
            "legalStatus",
            "comInvoicePaymentMethod",
            "accountTechnology",
            "accountSatellite",
            "billPaymentSystem",
            "skyhjFlag",
            "primaryAccountCountry",
            "comInvoiceBillPaymentSystem",
            "accountServicesUser",
            "accountServicesSystem",
            "accountServicesWeighting",
            "servicesPackage",
            "accountTypeRecharge",
            "errorCode",
            "errorMessage",
            "listOfProperty",
            "listOfServiceInstance",
            "listOfServiceInstanceType",
            "listOfServiceAgreement",
            "listOfAddress"
        })
        public static class Account {

            @XmlElement(name = "AccountNumber", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String accountNumber;
            @XmlElement(name = "AccountStatus", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String accountStatus;
            @XmlElement(name = "ServicesNumber", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String servicesNumber;
            @XmlElement(name = "PreActivateFlag", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String preActivateFlag;
            @XmlElement(name = "Location", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String location;
            @XmlElement(name = "SKYNEWERA", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String skynewera;
            @XmlElement(name = "Type", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String type;
            @XmlElement(name = "MarketType", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String marketType;
            @XmlElement(name = "MarketClass", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String marketClass;
            @XmlElement(name = "ComInvoiceBillCycle", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String comInvoiceBillCycle;
            @XmlElement(name = "CustomerSince", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String customerSince;
            @XmlElement(name = "SKYPromocion", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String skyPromocion;
            @XmlElement(name = "EstatusVeTV", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String estatusVeTV;
            @XmlElement(name = "AgreementName", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String agreementName;
            @XmlElement(name = "SKYIdDistributor", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String skyIdDistributor;
            @XmlElement(name = "SKYIdMaster", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String skyIdMaster;
            @XmlElement(name = "ParentAccountName", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String parentAccountName;
            @XmlElement(name = "LegalStatus", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String legalStatus;
            @XmlElement(name = "ComInvoicePaymentMethod", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String comInvoicePaymentMethod;
            @XmlElement(name = "AccountTechnology", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String accountTechnology;
            @XmlElement(name = "AccountSatellite", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String accountSatellite;
            @XmlElement(name = "BillPaymentSystem", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String billPaymentSystem;
            @XmlElement(name = "SKYHJFlag", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String skyhjFlag;
            @XmlElement(name = "PrimaryAccountCountry", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String primaryAccountCountry;
            @XmlElement(name = "ComInvoiceBillPaymentSystem", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String comInvoiceBillPaymentSystem;
            @XmlElement(name = "AccountServicesUser", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String accountServicesUser;
            @XmlElement(name = "AccountServicesSystem", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String accountServicesSystem;
            @XmlElement(name = "AccountServicesWeighting", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String accountServicesWeighting;
            @XmlElement(name = "ServicesPackage", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String servicesPackage;
            @XmlElement(name = "AccountTypeRecharge", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String accountTypeRecharge;
            @XmlElement(name = "ErrorCode", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String errorCode;
            @XmlElement(name = "ErrorMessage", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected String errorMessage;
            @XmlElement(name = "ListOfProperty", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfProperty listOfProperty;
            @XmlElement(name = "ListOfServiceInstance", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance listOfServiceInstance;
            @XmlElement(name = "ListOfServiceInstanceType", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstanceType listOfServiceInstanceType;
            @XmlElement(name = "ListOfServiceAgreement", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceAgreement listOfServiceAgreement;
            @XmlElement(name = "ListOfAddress", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
            protected ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfAddress listOfAddress;

            /**
             * Gets the value of the accountNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountNumber() {
                return accountNumber;
            }

            /**
             * Sets the value of the accountNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountNumber(String value) {
                this.accountNumber = value;
            }

            /**
             * Gets the value of the accountStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountStatus() {
                return accountStatus;
            }

            /**
             * Sets the value of the accountStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountStatus(String value) {
                this.accountStatus = value;
            }

            /**
             * Gets the value of the servicesNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServicesNumber() {
                return servicesNumber;
            }

            /**
             * Sets the value of the servicesNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServicesNumber(String value) {
                this.servicesNumber = value;
            }

            /**
             * Gets the value of the preActivateFlag property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreActivateFlag() {
                return preActivateFlag;
            }

            /**
             * Sets the value of the preActivateFlag property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreActivateFlag(String value) {
                this.preActivateFlag = value;
            }

            /**
             * Gets the value of the location property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocation() {
                return location;
            }

            /**
             * Sets the value of the location property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocation(String value) {
                this.location = value;
            }

            /**
             * Gets the value of the skynewera property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSKYNEWERA() {
                return skynewera;
            }

            /**
             * Sets the value of the skynewera property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSKYNEWERA(String value) {
                this.skynewera = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the marketType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMarketType() {
                return marketType;
            }

            /**
             * Sets the value of the marketType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMarketType(String value) {
                this.marketType = value;
            }

            /**
             * Gets the value of the marketClass property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMarketClass() {
                return marketClass;
            }

            /**
             * Sets the value of the marketClass property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMarketClass(String value) {
                this.marketClass = value;
            }

            /**
             * Gets the value of the comInvoiceBillCycle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getComInvoiceBillCycle() {
                return comInvoiceBillCycle;
            }

            /**
             * Sets the value of the comInvoiceBillCycle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setComInvoiceBillCycle(String value) {
                this.comInvoiceBillCycle = value;
            }

            /**
             * Gets the value of the customerSince property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerSince() {
                return customerSince;
            }

            /**
             * Sets the value of the customerSince property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerSince(String value) {
                this.customerSince = value;
            }

            /**
             * Gets the value of the skyPromocion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSKYPromocion() {
                return skyPromocion;
            }

            /**
             * Sets the value of the skyPromocion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSKYPromocion(String value) {
                this.skyPromocion = value;
            }

            /**
             * Gets the value of the estatusVeTV property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEstatusVeTV() {
                return estatusVeTV;
            }

            /**
             * Sets the value of the estatusVeTV property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEstatusVeTV(String value) {
                this.estatusVeTV = value;
            }

            /**
             * Gets the value of the agreementName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgreementName() {
                return agreementName;
            }

            /**
             * Sets the value of the agreementName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgreementName(String value) {
                this.agreementName = value;
            }

            /**
             * Gets the value of the skyIdDistributor property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSKYIdDistributor() {
                return skyIdDistributor;
            }

            /**
             * Sets the value of the skyIdDistributor property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSKYIdDistributor(String value) {
                this.skyIdDistributor = value;
            }

            /**
             * Gets the value of the skyIdMaster property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSKYIdMaster() {
                return skyIdMaster;
            }

            /**
             * Sets the value of the skyIdMaster property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSKYIdMaster(String value) {
                this.skyIdMaster = value;
            }

            /**
             * Gets the value of the parentAccountName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParentAccountName() {
                return parentAccountName;
            }

            /**
             * Sets the value of the parentAccountName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParentAccountName(String value) {
                this.parentAccountName = value;
            }

            /**
             * Gets the value of the legalStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLegalStatus() {
                return legalStatus;
            }

            /**
             * Sets the value of the legalStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLegalStatus(String value) {
                this.legalStatus = value;
            }

            /**
             * Gets the value of the comInvoicePaymentMethod property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getComInvoicePaymentMethod() {
                return comInvoicePaymentMethod;
            }

            /**
             * Sets the value of the comInvoicePaymentMethod property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setComInvoicePaymentMethod(String value) {
                this.comInvoicePaymentMethod = value;
            }

            /**
             * Gets the value of the accountTechnology property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountTechnology() {
                return accountTechnology;
            }

            /**
             * Sets the value of the accountTechnology property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountTechnology(String value) {
                this.accountTechnology = value;
            }

            /**
             * Gets the value of the accountSatellite property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountSatellite() {
                return accountSatellite;
            }

            /**
             * Sets the value of the accountSatellite property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountSatellite(String value) {
                this.accountSatellite = value;
            }

            /**
             * Gets the value of the billPaymentSystem property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBillPaymentSystem() {
                return billPaymentSystem;
            }

            /**
             * Sets the value of the billPaymentSystem property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBillPaymentSystem(String value) {
                this.billPaymentSystem = value;
            }

            /**
             * Gets the value of the skyhjFlag property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSKYHJFlag() {
                return skyhjFlag;
            }

            /**
             * Sets the value of the skyhjFlag property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSKYHJFlag(String value) {
                this.skyhjFlag = value;
            }

            /**
             * Gets the value of the primaryAccountCountry property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrimaryAccountCountry() {
                return primaryAccountCountry;
            }

            /**
             * Sets the value of the primaryAccountCountry property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrimaryAccountCountry(String value) {
                this.primaryAccountCountry = value;
            }

            /**
             * Gets the value of the comInvoiceBillPaymentSystem property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getComInvoiceBillPaymentSystem() {
                return comInvoiceBillPaymentSystem;
            }

            /**
             * Sets the value of the comInvoiceBillPaymentSystem property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setComInvoiceBillPaymentSystem(String value) {
                this.comInvoiceBillPaymentSystem = value;
            }

            /**
             * Gets the value of the accountServicesUser property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountServicesUser() {
                return accountServicesUser;
            }

            /**
             * Sets the value of the accountServicesUser property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountServicesUser(String value) {
                this.accountServicesUser = value;
            }

            /**
             * Gets the value of the accountServicesSystem property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountServicesSystem() {
                return accountServicesSystem;
            }

            /**
             * Sets the value of the accountServicesSystem property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountServicesSystem(String value) {
                this.accountServicesSystem = value;
            }

            /**
             * Gets the value of the accountServicesWeighting property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountServicesWeighting() {
                return accountServicesWeighting;
            }

            /**
             * Sets the value of the accountServicesWeighting property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountServicesWeighting(String value) {
                this.accountServicesWeighting = value;
            }

            /**
             * Gets the value of the servicesPackage property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServicesPackage() {
                return servicesPackage;
            }

            /**
             * Sets the value of the servicesPackage property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServicesPackage(String value) {
                this.servicesPackage = value;
            }

            /**
             * Gets the value of the accountTypeRecharge property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountTypeRecharge() {
                return accountTypeRecharge;
            }

            /**
             * Sets the value of the accountTypeRecharge property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountTypeRecharge(String value) {
                this.accountTypeRecharge = value;
            }

            /**
             * Gets the value of the errorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getErrorCode() {
                return errorCode;
            }

            /**
             * Sets the value of the errorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setErrorCode(String value) {
                this.errorCode = value;
            }

            /**
             * Gets the value of the errorMessage property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getErrorMessage() {
                return errorMessage;
            }

            /**
             * Sets the value of the errorMessage property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setErrorMessage(String value) {
                this.errorMessage = value;
            }

            /**
             * Gets the value of the listOfProperty property.
             * 
             * @return
             *     possible object is
             *     {@link ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfProperty }
             *     
             */
            public ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfProperty getListOfProperty() {
                return listOfProperty;
            }

            /**
             * Sets the value of the listOfProperty property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfProperty }
             *     
             */
            public void setListOfProperty(ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfProperty value) {
                this.listOfProperty = value;
            }

            /**
             * Gets the value of the listOfServiceInstance property.
             * 
             * @return
             *     possible object is
             *     {@link ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance }
             *     
             */
            public ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance getListOfServiceInstance() {
                return listOfServiceInstance;
            }

            /**
             * Sets the value of the listOfServiceInstance property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance }
             *     
             */
            public void setListOfServiceInstance(ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance value) {
                this.listOfServiceInstance = value;
            }

            /**
             * Gets the value of the listOfServiceInstanceType property.
             * 
             * @return
             *     possible object is
             *     {@link ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstanceType }
             *     
             */
            public ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstanceType getListOfServiceInstanceType() {
                return listOfServiceInstanceType;
            }

            /**
             * Sets the value of the listOfServiceInstanceType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstanceType }
             *     
             */
            public void setListOfServiceInstanceType(ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstanceType value) {
                this.listOfServiceInstanceType = value;
            }

            /**
             * Gets the value of the listOfServiceAgreement property.
             * 
             * @return
             *     possible object is
             *     {@link ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceAgreement }
             *     
             */
            public ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceAgreement getListOfServiceAgreement() {
                return listOfServiceAgreement;
            }

            /**
             * Sets the value of the listOfServiceAgreement property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceAgreement }
             *     
             */
            public void setListOfServiceAgreement(ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceAgreement value) {
                this.listOfServiceAgreement = value;
            }

            /**
             * Gets the value of the listOfAddress property.
             * 
             * @return
             *     possible object is
             *     {@link ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfAddress }
             *     
             */
            public ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfAddress getListOfAddress() {
                return listOfAddress;
            }

            /**
             * Sets the value of the listOfAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfAddress }
             *     
             */
            public void setListOfAddress(ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfAddress value) {
                this.listOfAddress = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="AccountAddress" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="AddrType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="StreetAddrCalle" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="NumInt" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="ProvinceColonia" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="AddrNumNumExt" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="CityPoblacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="CountyDelMun" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="StateEstado" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="CountryPais" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="PostalCodeCP" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="EntreCalle1" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="EntreCalle2" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="MDUFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="AddrId" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "accountAddress"
            })
            public static class ListOfAddress {

                @XmlElement(name = "AccountAddress", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta")
                protected List<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfAddress.AccountAddress> accountAddress;

                /**
                 * Gets the value of the accountAddress property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the accountAddress property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAccountAddress().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfAddress.AccountAddress }
                 * 
                 * 
                 */
                public List<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfAddress.AccountAddress> getAccountAddress() {
                    if (accountAddress == null) {
                        accountAddress = new ArrayList<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfAddress.AccountAddress>();
                    }
                    return this.accountAddress;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="AddrType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="StreetAddrCalle" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="NumInt" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="ProvinceColonia" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="AddrNumNumExt" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="CityPoblacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="CountyDelMun" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="StateEstado" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="CountryPais" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="PostalCodeCP" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="EntreCalle1" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="EntreCalle2" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="MDUFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="AddrId" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "primary",
                    "addrType",
                    "streetAddrCalle",
                    "numInt",
                    "provinceColonia",
                    "addrNumNumExt",
                    "cityPoblacion",
                    "countyDelMun",
                    "stateEstado",
                    "countryPais",
                    "postalCodeCP",
                    "entreCalle1",
                    "entreCalle2",
                    "latitude",
                    "longitude",
                    "mduFlag",
                    "addrId"
                })
                public static class AccountAddress {

                    @XmlElement(name = "Primary", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String primary;
                    @XmlElement(name = "AddrType", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String addrType;
                    @XmlElement(name = "StreetAddrCalle", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String streetAddrCalle;
                    @XmlElement(name = "NumInt", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String numInt;
                    @XmlElement(name = "ProvinceColonia", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String provinceColonia;
                    @XmlElement(name = "AddrNumNumExt", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String addrNumNumExt;
                    @XmlElement(name = "CityPoblacion", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String cityPoblacion;
                    @XmlElement(name = "CountyDelMun", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String countyDelMun;
                    @XmlElement(name = "StateEstado", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String stateEstado;
                    @XmlElement(name = "CountryPais", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String countryPais;
                    @XmlElement(name = "PostalCodeCP", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String postalCodeCP;
                    @XmlElement(name = "EntreCalle1", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String entreCalle1;
                    @XmlElement(name = "EntreCalle2", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String entreCalle2;
                    @XmlElement(name = "Latitude", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String latitude;
                    @XmlElement(name = "Longitude", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String longitude;
                    @XmlElement(name = "MDUFlag", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String mduFlag;
                    @XmlElement(name = "AddrId", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String addrId;

                    /**
                     * Gets the value of the primary property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPrimary() {
                        return primary;
                    }

                    /**
                     * Sets the value of the primary property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPrimary(String value) {
                        this.primary = value;
                    }

                    /**
                     * Gets the value of the addrType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAddrType() {
                        return addrType;
                    }

                    /**
                     * Sets the value of the addrType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAddrType(String value) {
                        this.addrType = value;
                    }

                    /**
                     * Gets the value of the streetAddrCalle property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStreetAddrCalle() {
                        return streetAddrCalle;
                    }

                    /**
                     * Sets the value of the streetAddrCalle property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStreetAddrCalle(String value) {
                        this.streetAddrCalle = value;
                    }

                    /**
                     * Gets the value of the numInt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumInt() {
                        return numInt;
                    }

                    /**
                     * Sets the value of the numInt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumInt(String value) {
                        this.numInt = value;
                    }

                    /**
                     * Gets the value of the provinceColonia property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProvinceColonia() {
                        return provinceColonia;
                    }

                    /**
                     * Sets the value of the provinceColonia property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProvinceColonia(String value) {
                        this.provinceColonia = value;
                    }

                    /**
                     * Gets the value of the addrNumNumExt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAddrNumNumExt() {
                        return addrNumNumExt;
                    }

                    /**
                     * Sets the value of the addrNumNumExt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAddrNumNumExt(String value) {
                        this.addrNumNumExt = value;
                    }

                    /**
                     * Gets the value of the cityPoblacion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCityPoblacion() {
                        return cityPoblacion;
                    }

                    /**
                     * Sets the value of the cityPoblacion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCityPoblacion(String value) {
                        this.cityPoblacion = value;
                    }

                    /**
                     * Gets the value of the countyDelMun property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCountyDelMun() {
                        return countyDelMun;
                    }

                    /**
                     * Sets the value of the countyDelMun property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCountyDelMun(String value) {
                        this.countyDelMun = value;
                    }

                    /**
                     * Gets the value of the stateEstado property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStateEstado() {
                        return stateEstado;
                    }

                    /**
                     * Sets the value of the stateEstado property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStateEstado(String value) {
                        this.stateEstado = value;
                    }

                    /**
                     * Gets the value of the countryPais property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCountryPais() {
                        return countryPais;
                    }

                    /**
                     * Sets the value of the countryPais property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCountryPais(String value) {
                        this.countryPais = value;
                    }

                    /**
                     * Gets the value of the postalCodeCP property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPostalCodeCP() {
                        return postalCodeCP;
                    }

                    /**
                     * Sets the value of the postalCodeCP property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPostalCodeCP(String value) {
                        this.postalCodeCP = value;
                    }

                    /**
                     * Gets the value of the entreCalle1 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEntreCalle1() {
                        return entreCalle1;
                    }

                    /**
                     * Sets the value of the entreCalle1 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEntreCalle1(String value) {
                        this.entreCalle1 = value;
                    }

                    /**
                     * Gets the value of the entreCalle2 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEntreCalle2() {
                        return entreCalle2;
                    }

                    /**
                     * Sets the value of the entreCalle2 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEntreCalle2(String value) {
                        this.entreCalle2 = value;
                    }

                    /**
                     * Gets the value of the latitude property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLatitude() {
                        return latitude;
                    }

                    /**
                     * Sets the value of the latitude property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLatitude(String value) {
                        this.latitude = value;
                    }

                    /**
                     * Gets the value of the longitude property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLongitude() {
                        return longitude;
                    }

                    /**
                     * Sets the value of the longitude property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLongitude(String value) {
                        this.longitude = value;
                    }

                    /**
                     * Gets the value of the mduFlag property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMDUFlag() {
                        return mduFlag;
                    }

                    /**
                     * Sets the value of the mduFlag property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMDUFlag(String value) {
                        this.mduFlag = value;
                    }

                    /**
                     * Gets the value of the addrId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAddrId() {
                        return addrId;
                    }

                    /**
                     * Sets the value of the addrId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAddrId(String value) {
                        this.addrId = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Property" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="PropertyValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "property"
            })
            public static class ListOfProperty {

                @XmlElement(name = "Property", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta")
                protected List<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfProperty.Property> property;

                /**
                 * Gets the value of the property property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the property property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProperty().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfProperty.Property }
                 * 
                 * 
                 */
                public List<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfProperty.Property> getProperty() {
                    if (property == null) {
                        property = new ArrayList<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfProperty.Property>();
                    }
                    return this.property;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="PropertyValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "propertyName",
                    "propertyValue",
                    "startDate",
                    "endDate",
                    "description"
                })
                public static class Property {

                    @XmlElement(name = "PropertyName", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String propertyName;
                    @XmlElement(name = "PropertyValue", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String propertyValue;
                    @XmlElement(name = "StartDate", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String startDate;
                    @XmlElement(name = "EndDate", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String endDate;
                    @XmlElement(name = "Description", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String description;

                    /**
                     * Gets the value of the propertyName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPropertyName() {
                        return propertyName;
                    }

                    /**
                     * Sets the value of the propertyName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPropertyName(String value) {
                        this.propertyName = value;
                    }

                    /**
                     * Gets the value of the propertyValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPropertyValue() {
                        return propertyValue;
                    }

                    /**
                     * Sets the value of the propertyValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPropertyValue(String value) {
                        this.propertyValue = value;
                    }

                    /**
                     * Gets the value of the startDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStartDate() {
                        return startDate;
                    }

                    /**
                     * Sets the value of the startDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStartDate(String value) {
                        this.startDate = value;
                    }

                    /**
                     * Gets the value of the endDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEndDate() {
                        return endDate;
                    }

                    /**
                     * Sets the value of the endDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEndDate(String value) {
                        this.endDate = value;
                    }

                    /**
                     * Gets the value of the description property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescription() {
                        return description;
                    }

                    /**
                     * Sets the value of the description property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescription(String value) {
                        this.description = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ServiceAgreement" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="SubscriptionAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="AgreementNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="AgreementStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="AgreementStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="AgreementType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="CanaldeVentaWEB" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="PlazoForzosoContrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="SKYPaquete" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="SKYPaqueteActivaciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="SKYPlazoForzoso" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="SKYRecargaMini" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="SKYPromocion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="SKYPromocionActivaciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="SKYVTVPlazoForzoso" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="ServiceFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "serviceAgreement"
            })
            public static class ListOfServiceAgreement {

                @XmlElement(name = "ServiceAgreement", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta")
                protected List<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceAgreement.ServiceAgreement> serviceAgreement;

                /**
                 * Gets the value of the serviceAgreement property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the serviceAgreement property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getServiceAgreement().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceAgreement.ServiceAgreement }
                 * 
                 * 
                 */
                public List<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceAgreement.ServiceAgreement> getServiceAgreement() {
                    if (serviceAgreement == null) {
                        serviceAgreement = new ArrayList<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceAgreement.ServiceAgreement>();
                    }
                    return this.serviceAgreement;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="SubscriptionAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="AgreementNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="AgreementStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="AgreementStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="AgreementType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="CanaldeVentaWEB" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="PlazoForzosoContrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="SKYPaquete" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="SKYPaqueteActivaciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="SKYPlazoForzoso" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="SKYRecargaMini" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="SKYPromocion" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="SKYPromocionActivaciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="SKYVTVPlazoForzoso" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="ServiceFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "primary",
                    "subscriptionAmount",
                    "agreementNumber",
                    "agreementStartDate",
                    "agreementStatus",
                    "agreementType",
                    "canaldeVentaWEB",
                    "plazoForzosoContrato",
                    "skyPaquete",
                    "skyPaqueteActivaciones",
                    "skyPlazoForzoso",
                    "skyRecargaMini",
                    "skyPromocion",
                    "skyPromocionActivaciones",
                    "skyvtvPlazoForzoso",
                    "serviceFlag",
                    "serviceType"
                })
                public static class ServiceAgreement {

                    @XmlElement(name = "Primary", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String primary;
                    @XmlElement(name = "SubscriptionAmount", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String subscriptionAmount;
                    @XmlElement(name = "AgreementNumber", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String agreementNumber;
                    @XmlElement(name = "AgreementStartDate", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String agreementStartDate;
                    @XmlElement(name = "AgreementStatus", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String agreementStatus;
                    @XmlElement(name = "AgreementType", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String agreementType;
                    @XmlElement(name = "CanaldeVentaWEB", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String canaldeVentaWEB;
                    @XmlElement(name = "PlazoForzosoContrato", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String plazoForzosoContrato;
                    @XmlElement(name = "SKYPaquete", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String skyPaquete;
                    @XmlElement(name = "SKYPaqueteActivaciones", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String skyPaqueteActivaciones;
                    @XmlElement(name = "SKYPlazoForzoso", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String skyPlazoForzoso;
                    @XmlElement(name = "SKYRecargaMini", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String skyRecargaMini;
                    @XmlElement(name = "SKYPromocion", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String skyPromocion;
                    @XmlElement(name = "SKYPromocionActivaciones", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String skyPromocionActivaciones;
                    @XmlElement(name = "SKYVTVPlazoForzoso", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String skyvtvPlazoForzoso;
                    @XmlElement(name = "ServiceFlag", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String serviceFlag;
                    @XmlElement(name = "ServiceType", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String serviceType;

                    /**
                     * Gets the value of the primary property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPrimary() {
                        return primary;
                    }

                    /**
                     * Sets the value of the primary property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPrimary(String value) {
                        this.primary = value;
                    }

                    /**
                     * Gets the value of the subscriptionAmount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSubscriptionAmount() {
                        return subscriptionAmount;
                    }

                    /**
                     * Sets the value of the subscriptionAmount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSubscriptionAmount(String value) {
                        this.subscriptionAmount = value;
                    }

                    /**
                     * Gets the value of the agreementNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAgreementNumber() {
                        return agreementNumber;
                    }

                    /**
                     * Sets the value of the agreementNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAgreementNumber(String value) {
                        this.agreementNumber = value;
                    }

                    /**
                     * Gets the value of the agreementStartDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAgreementStartDate() {
                        return agreementStartDate;
                    }

                    /**
                     * Sets the value of the agreementStartDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAgreementStartDate(String value) {
                        this.agreementStartDate = value;
                    }

                    /**
                     * Gets the value of the agreementStatus property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAgreementStatus() {
                        return agreementStatus;
                    }

                    /**
                     * Sets the value of the agreementStatus property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAgreementStatus(String value) {
                        this.agreementStatus = value;
                    }

                    /**
                     * Gets the value of the agreementType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAgreementType() {
                        return agreementType;
                    }

                    /**
                     * Sets the value of the agreementType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAgreementType(String value) {
                        this.agreementType = value;
                    }

                    /**
                     * Gets the value of the canaldeVentaWEB property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCanaldeVentaWEB() {
                        return canaldeVentaWEB;
                    }

                    /**
                     * Sets the value of the canaldeVentaWEB property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCanaldeVentaWEB(String value) {
                        this.canaldeVentaWEB = value;
                    }

                    /**
                     * Gets the value of the plazoForzosoContrato property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPlazoForzosoContrato() {
                        return plazoForzosoContrato;
                    }

                    /**
                     * Sets the value of the plazoForzosoContrato property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPlazoForzosoContrato(String value) {
                        this.plazoForzosoContrato = value;
                    }

                    /**
                     * Gets the value of the skyPaquete property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSKYPaquete() {
                        return skyPaquete;
                    }

                    /**
                     * Sets the value of the skyPaquete property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSKYPaquete(String value) {
                        this.skyPaquete = value;
                    }

                    /**
                     * Gets the value of the skyPaqueteActivaciones property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSKYPaqueteActivaciones() {
                        return skyPaqueteActivaciones;
                    }

                    /**
                     * Sets the value of the skyPaqueteActivaciones property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSKYPaqueteActivaciones(String value) {
                        this.skyPaqueteActivaciones = value;
                    }

                    /**
                     * Gets the value of the skyPlazoForzoso property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSKYPlazoForzoso() {
                        return skyPlazoForzoso;
                    }

                    /**
                     * Sets the value of the skyPlazoForzoso property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSKYPlazoForzoso(String value) {
                        this.skyPlazoForzoso = value;
                    }

                    /**
                     * Gets the value of the skyRecargaMini property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSKYRecargaMini() {
                        return skyRecargaMini;
                    }

                    /**
                     * Sets the value of the skyRecargaMini property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSKYRecargaMini(String value) {
                        this.skyRecargaMini = value;
                    }

                    /**
                     * Gets the value of the skyPromocion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSKYPromocion() {
                        return skyPromocion;
                    }

                    /**
                     * Sets the value of the skyPromocion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSKYPromocion(String value) {
                        this.skyPromocion = value;
                    }

                    /**
                     * Gets the value of the skyPromocionActivaciones property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSKYPromocionActivaciones() {
                        return skyPromocionActivaciones;
                    }

                    /**
                     * Sets the value of the skyPromocionActivaciones property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSKYPromocionActivaciones(String value) {
                        this.skyPromocionActivaciones = value;
                    }

                    /**
                     * Gets the value of the skyvtvPlazoForzoso property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSKYVTVPlazoForzoso() {
                        return skyvtvPlazoForzoso;
                    }

                    /**
                     * Sets the value of the skyvtvPlazoForzoso property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSKYVTVPlazoForzoso(String value) {
                        this.skyvtvPlazoForzoso = value;
                    }

                    /**
                     * Gets the value of the serviceFlag property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getServiceFlag() {
                        return serviceFlag;
                    }

                    /**
                     * Sets the value of the serviceFlag property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setServiceFlag(String value) {
                        this.serviceFlag = value;
                    }

                    /**
                     * Gets the value of the serviceType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getServiceType() {
                        return serviceType;
                    }

                    /**
                     * Sets the value of the serviceType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setServiceType(String value) {
                        this.serviceType = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ServiceInstance" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="SlaveHierarchy" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="AssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="SecondAssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="ServiceProductType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="AgreementName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="ServiceSupplier" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="EventTypeExtern" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="HouseHoldId" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="ListOfInstanceComponent">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="InstanceComponent" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="SKYHJProveedorServicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="ProductCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="EffectiveStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="EffectiveEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="ProductoVencidoFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="DownloadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="UOMDownloadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="UploadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="UOMUploadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="ExternalOffer" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "serviceInstance"
            })
            public static class ListOfServiceInstance {

                @XmlElement(name = "ServiceInstance", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta")
                protected List<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance> serviceInstance;

                /**
                 * Gets the value of the serviceInstance property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the serviceInstance property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getServiceInstance().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance }
                 * 
                 * 
                 */
                public List<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance> getServiceInstance() {
                    if (serviceInstance == null) {
                        serviceInstance = new ArrayList<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance>();
                    }
                    return this.serviceInstance;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="SlaveHierarchy" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="AssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="SecondAssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="ServiceProductType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="AgreementName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="ServiceSupplier" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="EventTypeExtern" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="HouseHoldId" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="ListOfInstanceComponent">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="InstanceComponent" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="SKYHJProveedorServicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="ProductCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="EffectiveStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="EffectiveEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="ProductoVencidoFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="DownloadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="UOMDownloadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="UploadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="UOMUploadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="ExternalOffer" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "slaveHierarchy",
                    "statusCode",
                    "assetNumber",
                    "secondAssetNumber",
                    "integrationId",
                    "serviceProductType",
                    "agreementName",
                    "serviceSupplier",
                    "eventTypeExtern",
                    "msisdn",
                    "houseHoldId",
                    "listOfInstanceComponent"
                })
                public static class ServiceInstance {

                    @XmlElement(name = "SlaveHierarchy", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String slaveHierarchy;
                    @XmlElement(name = "StatusCode", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String statusCode;
                    @XmlElement(name = "AssetNumber", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String assetNumber;
                    @XmlElement(name = "SecondAssetNumber", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String secondAssetNumber;
                    @XmlElement(name = "IntegrationId", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String integrationId;
                    @XmlElement(name = "ServiceProductType", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String serviceProductType;
                    @XmlElement(name = "AgreementName", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String agreementName;
                    @XmlElement(name = "ServiceSupplier", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String serviceSupplier;
                    @XmlElement(name = "EventTypeExtern", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String eventTypeExtern;
                    @XmlElement(name = "MSISDN", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta")
                    protected String msisdn;
                    @XmlElement(name = "HouseHoldId", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String houseHoldId;
                    @XmlElement(name = "ListOfInstanceComponent", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance.ListOfInstanceComponent listOfInstanceComponent;

                    /**
                     * Gets the value of the slaveHierarchy property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSlaveHierarchy() {
                        return slaveHierarchy;
                    }

                    /**
                     * Sets the value of the slaveHierarchy property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSlaveHierarchy(String value) {
                        this.slaveHierarchy = value;
                    }

                    /**
                     * Gets the value of the statusCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStatusCode() {
                        return statusCode;
                    }

                    /**
                     * Sets the value of the statusCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStatusCode(String value) {
                        this.statusCode = value;
                    }

                    /**
                     * Gets the value of the assetNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAssetNumber() {
                        return assetNumber;
                    }

                    /**
                     * Sets the value of the assetNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAssetNumber(String value) {
                        this.assetNumber = value;
                    }

                    /**
                     * Gets the value of the secondAssetNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSecondAssetNumber() {
                        return secondAssetNumber;
                    }

                    /**
                     * Sets the value of the secondAssetNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSecondAssetNumber(String value) {
                        this.secondAssetNumber = value;
                    }

                    /**
                     * Gets the value of the integrationId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIntegrationId() {
                        return integrationId;
                    }

                    /**
                     * Sets the value of the integrationId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIntegrationId(String value) {
                        this.integrationId = value;
                    }

                    /**
                     * Gets the value of the serviceProductType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getServiceProductType() {
                        return serviceProductType;
                    }

                    /**
                     * Sets the value of the serviceProductType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setServiceProductType(String value) {
                        this.serviceProductType = value;
                    }

                    /**
                     * Gets the value of the agreementName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAgreementName() {
                        return agreementName;
                    }

                    /**
                     * Sets the value of the agreementName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAgreementName(String value) {
                        this.agreementName = value;
                    }

                    /**
                     * Gets the value of the serviceSupplier property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getServiceSupplier() {
                        return serviceSupplier;
                    }

                    /**
                     * Sets the value of the serviceSupplier property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setServiceSupplier(String value) {
                        this.serviceSupplier = value;
                    }

                    /**
                     * Gets the value of the eventTypeExtern property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEventTypeExtern() {
                        return eventTypeExtern;
                    }

                    /**
                     * Sets the value of the eventTypeExtern property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEventTypeExtern(String value) {
                        this.eventTypeExtern = value;
                    }

                    /**
                     * Gets the value of the msisdn property.
                     * 
                     */
                    public String getMSISDN() {
                        return msisdn;
                    }

                    /**
                     * Sets the value of the msisdn property.
                     * 
                     */
                    public void setMSISDN(String value) {
                        this.msisdn = value;
                    }

                    /**
                     * Gets the value of the houseHoldId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHouseHoldId() {
                        return houseHoldId;
                    }

                    /**
                     * Sets the value of the houseHoldId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHouseHoldId(String value) {
                        this.houseHoldId = value;
                    }

                    /**
                     * Gets the value of the listOfInstanceComponent property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance.ListOfInstanceComponent }
                     *     
                     */
                    public ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance.ListOfInstanceComponent getListOfInstanceComponent() {
                        return listOfInstanceComponent;
                    }

                    /**
                     * Sets the value of the listOfInstanceComponent property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance.ListOfInstanceComponent }
                     *     
                     */
                    public void setListOfInstanceComponent(ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance.ListOfInstanceComponent value) {
                        this.listOfInstanceComponent = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="InstanceComponent" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="SKYHJProveedorServicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="ProductCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="EffectiveStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="EffectiveEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="ProductoVencidoFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="DownloadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="UOMDownloadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="UploadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="UOMUploadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="ExternalOffer" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "instanceComponent"
                    })
                    public static class ListOfInstanceComponent {

                        @XmlElement(name = "InstanceComponent", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta")
                        protected List<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance.ListOfInstanceComponent.InstanceComponent> instanceComponent;

                        /**
                         * Gets the value of the instanceComponent property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the instanceComponent property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getInstanceComponent().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance.ListOfInstanceComponent.InstanceComponent }
                         * 
                         * 
                         */
                        public List<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance.ListOfInstanceComponent.InstanceComponent> getInstanceComponent() {
                            if (instanceComponent == null) {
                                instanceComponent = new ArrayList<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance.ListOfInstanceComponent.InstanceComponent>();
                            }
                            return this.instanceComponent;
                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="SKYHJProveedorServicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="ProductCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="EffectiveStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="EffectiveEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="ProductoVencidoFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="DownloadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="UOMDownloadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="UploadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="UOMUploadSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="ExternalOffer" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "integrationId",
                            "product",
                            "skyhjProveedorServicio",
                            "productCategory",
                            "action",
                            "statusCode",
                            "effectiveStartDate",
                            "effectiveEndDate",
                            "productoVencidoFlag",
                            "downloadSpeed",
                            "uomDownloadSpeed",
                            "uploadSpeed",
                            "uomUploadSpeed",
                            "externalOffer"
                        })
                        public static class InstanceComponent {

                            @XmlElement(name = "IntegrationId", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                            protected String integrationId;
                            @XmlElement(name = "Product", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                            protected String product;
                            @XmlElement(name = "SKYHJProveedorServicio", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                            protected String skyhjProveedorServicio;
                            @XmlElement(name = "ProductCategory", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                            protected String productCategory;
                            @XmlElement(name = "Action", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                            protected String action;
                            @XmlElement(name = "StatusCode", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                            protected String statusCode;
                            @XmlElement(name = "EffectiveStartDate", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                            protected String effectiveStartDate;
                            @XmlElement(name = "EffectiveEndDate", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                            protected String effectiveEndDate;
                            @XmlElement(name = "ProductoVencidoFlag", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                            protected String productoVencidoFlag;
                            @XmlElement(name = "DownloadSpeed", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                            protected String downloadSpeed;
                            @XmlElement(name = "UOMDownloadSpeed", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                            protected String uomDownloadSpeed;
                            @XmlElement(name = "UploadSpeed", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                            protected String uploadSpeed;
                            @XmlElement(name = "UOMUploadSpeed", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                            protected String uomUploadSpeed;
                            @XmlElement(name = "ExternalOffer", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                            protected String externalOffer;

                            /**
                             * Gets the value of the integrationId property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getIntegrationId() {
                                return integrationId;
                            }

                            /**
                             * Sets the value of the integrationId property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setIntegrationId(String value) {
                                this.integrationId = value;
                            }

                            /**
                             * Gets the value of the product property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getProduct() {
                                return product;
                            }

                            /**
                             * Sets the value of the product property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setProduct(String value) {
                                this.product = value;
                            }

                            /**
                             * Gets the value of the skyhjProveedorServicio property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getSKYHJProveedorServicio() {
                                return skyhjProveedorServicio;
                            }

                            /**
                             * Sets the value of the skyhjProveedorServicio property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setSKYHJProveedorServicio(String value) {
                                this.skyhjProveedorServicio = value;
                            }

                            /**
                             * Gets the value of the productCategory property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getProductCategory() {
                                return productCategory;
                            }

                            /**
                             * Sets the value of the productCategory property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setProductCategory(String value) {
                                this.productCategory = value;
                            }

                            /**
                             * Gets the value of the action property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getAction() {
                                return action;
                            }

                            /**
                             * Sets the value of the action property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setAction(String value) {
                                this.action = value;
                            }

                            /**
                             * Gets the value of the statusCode property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getStatusCode() {
                                return statusCode;
                            }

                            /**
                             * Sets the value of the statusCode property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setStatusCode(String value) {
                                this.statusCode = value;
                            }

                            /**
                             * Gets the value of the effectiveStartDate property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getEffectiveStartDate() {
                                return effectiveStartDate;
                            }

                            /**
                             * Sets the value of the effectiveStartDate property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setEffectiveStartDate(String value) {
                                this.effectiveStartDate = value;
                            }

                            /**
                             * Gets the value of the effectiveEndDate property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getEffectiveEndDate() {
                                return effectiveEndDate;
                            }

                            /**
                             * Sets the value of the effectiveEndDate property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setEffectiveEndDate(String value) {
                                this.effectiveEndDate = value;
                            }

                            /**
                             * Gets the value of the productoVencidoFlag property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getProductoVencidoFlag() {
                                return productoVencidoFlag;
                            }

                            /**
                             * Sets the value of the productoVencidoFlag property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setProductoVencidoFlag(String value) {
                                this.productoVencidoFlag = value;
                            }

                            /**
                             * Gets the value of the downloadSpeed property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getDownloadSpeed() {
                                return downloadSpeed;
                            }

                            /**
                             * Sets the value of the downloadSpeed property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setDownloadSpeed(String value) {
                                this.downloadSpeed = value;
                            }

                            /**
                             * Gets the value of the uomDownloadSpeed property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getUOMDownloadSpeed() {
                                return uomDownloadSpeed;
                            }

                            /**
                             * Sets the value of the uomDownloadSpeed property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setUOMDownloadSpeed(String value) {
                                this.uomDownloadSpeed = value;
                            }

                            /**
                             * Gets the value of the uploadSpeed property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getUploadSpeed() {
                                return uploadSpeed;
                            }

                            /**
                             * Sets the value of the uploadSpeed property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setUploadSpeed(String value) {
                                this.uploadSpeed = value;
                            }

                            /**
                             * Gets the value of the uomUploadSpeed property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getUOMUploadSpeed() {
                                return uomUploadSpeed;
                            }

                            /**
                             * Sets the value of the uomUploadSpeed property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setUOMUploadSpeed(String value) {
                                this.uomUploadSpeed = value;
                            }

                            /**
                             * Gets the value of the externalOffer property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getExternalOffer() {
                                return externalOffer;
                            }

                            /**
                             * Sets the value of the externalOffer property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setExternalOffer(String value) {
                                this.externalOffer = value;
                            }

                        }

                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ServiceInstanceType" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ServiceProductType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="TotalInstancias" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Activo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Pendiente" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Suspendido" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Desconectado" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="FutureAddition" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="FutureDisconnection" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "serviceInstanceType"
            })
            public static class ListOfServiceInstanceType {

                @XmlElement(name = "ServiceInstanceType", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta")
                protected List<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstanceType.ServiceInstanceType> serviceInstanceType;

                /**
                 * Gets the value of the serviceInstanceType property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the serviceInstanceType property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getServiceInstanceType().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstanceType.ServiceInstanceType }
                 * 
                 * 
                 */
                public List<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstanceType.ServiceInstanceType> getServiceInstanceType() {
                    if (serviceInstanceType == null) {
                        serviceInstanceType = new ArrayList<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstanceType.ServiceInstanceType>();
                    }
                    return this.serviceInstanceType;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="ServiceProductType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="TotalInstancias" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Activo" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Pendiente" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Suspendido" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Desconectado" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="FutureAddition" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="FutureDisconnection" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "serviceProductType",
                    "totalInstancias",
                    "activo",
                    "pendiente",
                    "suspendido",
                    "desconectado",
                    "futureAddition",
                    "futureDisconnection",
                    "error"
                })
                public static class ServiceInstanceType {

                    @XmlElement(name = "ServiceProductType", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String serviceProductType;
                    @XmlElement(name = "TotalInstancias", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String totalInstancias;
                    @XmlElement(name = "Activo", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String activo;
                    @XmlElement(name = "Pendiente", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String pendiente;
                    @XmlElement(name = "Suspendido", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String suspendido;
                    @XmlElement(name = "Desconectado", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String desconectado;
                    @XmlElement(name = "FutureAddition", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String futureAddition;
                    @XmlElement(name = "FutureDisconnection", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String futureDisconnection;
                    @XmlElement(name = "Error", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta", required = true)
                    protected String error;

                    /**
                     * Gets the value of the serviceProductType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getServiceProductType() {
                        return serviceProductType;
                    }

                    /**
                     * Sets the value of the serviceProductType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setServiceProductType(String value) {
                        this.serviceProductType = value;
                    }

                    /**
                     * Gets the value of the totalInstancias property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTotalInstancias() {
                        return totalInstancias;
                    }

                    /**
                     * Sets the value of the totalInstancias property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTotalInstancias(String value) {
                        this.totalInstancias = value;
                    }

                    /**
                     * Gets the value of the activo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getActivo() {
                        return activo;
                    }

                    /**
                     * Sets the value of the activo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setActivo(String value) {
                        this.activo = value;
                    }

                    /**
                     * Gets the value of the pendiente property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPendiente() {
                        return pendiente;
                    }

                    /**
                     * Sets the value of the pendiente property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPendiente(String value) {
                        this.pendiente = value;
                    }

                    /**
                     * Gets the value of the suspendido property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSuspendido() {
                        return suspendido;
                    }

                    /**
                     * Sets the value of the suspendido property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSuspendido(String value) {
                        this.suspendido = value;
                    }

                    /**
                     * Gets the value of the desconectado property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDesconectado() {
                        return desconectado;
                    }

                    /**
                     * Sets the value of the desconectado property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDesconectado(String value) {
                        this.desconectado = value;
                    }

                    /**
                     * Gets the value of the futureAddition property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFutureAddition() {
                        return futureAddition;
                    }

                    /**
                     * Sets the value of the futureAddition property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFutureAddition(String value) {
                        this.futureAddition = value;
                    }

                    /**
                     * Gets the value of the futureDisconnection property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFutureDisconnection() {
                        return futureDisconnection;
                    }

                    /**
                     * Sets the value of the futureDisconnection property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFutureDisconnection(String value) {
                        this.futureDisconnection = value;
                    }

                    /**
                     * Gets the value of the error property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getError() {
                        return error;
                    }

                    /**
                     * Sets the value of the error property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setError(String value) {
                        this.error = value;
                    }

                }

            }

        }

    }

}
