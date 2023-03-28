public class ProfissionalMain {

    public static void main(String[] args) {

    Profissional profissional = new Profissional();
    profissional.idPublic = 1;
    profissional.trabalharPublic();
    profissional.trabalharProtected();
    profissional.salarioProtected = 1234.0;

        System.out.println(profissional.salariopublic);
        profissional.setId(1);
        System.out.println(profissional);profissional.getId();



    }
}
