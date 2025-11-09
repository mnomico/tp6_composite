package com.unluki.sincomposite;

public enum Estado {
    POR_ASIGNAR(0),
    EN_CURSO(25),
    EN_REVIEW(50),
    CASI_LISTO(75),
    COMPLETADO(100);

    private final int codigo;

    Estado(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
