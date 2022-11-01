package model;

import enums.TamanhoComida;
import enums.TipoBebida;
import enums.TipoComida;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ItemErrado {

    private long id;
    private BigDecimal valor;

    private TipoBebida drinkType;

    private TipoComida tipoFood;

    private TamanhoComida size;


    public ItemErrado(long id, BigDecimal valor, TipoBebida drinkType, TipoComida tipoFood, TamanhoComida size) {
        this.id = id;
        this.valor = valor;
        if((this.tipoFood == tipoFood) && (this.size == size)) {
            this.drinkType = null;
        } else if (this.drinkType == drinkType) {
            this.tipoFood = null;
            this.size = null;
        }
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public TipoBebida getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(TipoBebida drinkType) {
        this.drinkType = drinkType;
    }

    public TipoComida getTipoFood() {
        return tipoFood;
    }

    public void setTipoFood(TipoComida tipoFood) {
        this.tipoFood = tipoFood;
    }

    public TamanhoComida getSize() {
        return size;
    }

    public void setSize(TamanhoComida size) {
        this.size = size;
    }
}
