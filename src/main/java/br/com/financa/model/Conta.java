package br.com.financa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conta {

  @Id @GeneratedValue(strategy= GenerationType.IDENTITY)  
  private Integer id;
  private String titular;
  private String banco; 
  private String agencia;
  private String numero;

  public Integer getId() {
    return id;
  }
  public String getTitular() {
    return titular;
  }
  public String getBanco() {
    return banco;
  }
  public String getAgencia() {
    return agencia;
  }
  public String getNumero() {
    return numero;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public void setTitular(String titular) {
    this.titular = titular;
  }
  public void setBanco(String banco) {
    this.banco = banco;
  }
  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }
  public void setNumero(String numero) {
    this.numero = numero;
  }
}
