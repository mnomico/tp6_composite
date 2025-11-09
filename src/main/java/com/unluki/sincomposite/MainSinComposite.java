public class MainSinComposite {
    public static void main(String[] args) {
        Epic epicPrincipal = new Epic();
        Story story1 = new Story();
        Tarea tarea1 = new Tarea(777,8,"hablar sobre política con Juani te voy a extrañar Juani no te vayas");

        story1.addTarea(tarea1);
        epicPrincipal.addStory(story1);

        System.out.println(epicPrincipal.toString());
    }
}
