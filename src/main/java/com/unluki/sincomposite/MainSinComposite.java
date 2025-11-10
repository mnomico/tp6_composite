package com.unluki.sincomposite;

public class MainSinComposite {
    public static void main(String[] args) {
        Epic epicPrincipal = new Epic(1, "epic muy epic");
        Story story1 = new Story(1, "toy story");
        Tarea tarea1 = new Tarea(777,8,"hablar sobre política con Juani te voy a extrañar Juani no te vayas");

        story1.addTarea(tarea1);
        tarea1.setEstado(Estado.EN_CURSO);
        epicPrincipal.addStory(story1);

        System.out.println(epicPrincipal);
    }
}
