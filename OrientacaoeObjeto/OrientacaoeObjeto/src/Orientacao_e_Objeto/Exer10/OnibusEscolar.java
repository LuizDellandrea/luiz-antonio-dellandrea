package Orientacao_e_Objeto.Exer10;

public class OnibusEscolar {

    int alunos;
    int professores;

    
    public OnibusEscolar(int alunos, int professores) {

        
        if (professores == 0) {
            this.professores = 0;
            this.alunos = 0;
        } else {
            this.professores = professores;

           
            if (alunos > 40) {
                this.alunos = 40;
            } else {
                this.alunos = alunos;
            }
        }
    }
}


/*Faça uma classe chamada OnibusEscolar, com os atributos quantidade de estudantes e
quantidade de professores
Faça uma exceção no método setAlunos que limite o número máximo de estudantes a 40. Se
um valor superior for informado, ajuste automaticamente para 40.
Caso o número de professores for 0, o número de alunos também deve ser zerado */