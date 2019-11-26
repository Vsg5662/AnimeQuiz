package com.example.animequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    TextView pergunta;
    RadioButton rbResposta1, rbResposta2, rbResposta3, rbResposta4, rbResposta5, rb;
    RadioGroup rgRespostas;
    Button btnResponder;
    int pontos, cont=0;
    int respostaCerta;
    
    List<Questao> questoes = new ArrayList<Questao>(){
        {
            add(new Questao("Nanatsu no Taizai. \n Quem é o pecado da Ira?", R.id.rbResposta1,"Meliodas", "Ban", "King", "Diane", "Merlin"));
            add(new Questao("Nanatsu no Taizai. \n Quem é o pecado do Orgulho?", R.id.rbResposta5,"Ban", "Clowther", "Diane", "King", "Escanor"));
            add(new Questao("Nanatsu no Taizai. \n Quem era o melhor amigo de King?", R.id.rbResposta2,"Meliodas", "Helbran", "Diane", "Ban", "Elaine"));
            add(new Questao("Nanatsu no Taizai. \n Quem é a gigante dos Sete pecados?", R.id.rbResposta3,"Elizabeth", "Merlin", "Diane", "Guila", "Gericó"));
            add(new Questao("Nanatsu no Taizai. \n Quem é a namorada de Ban?", R.id.rbResposta5,"Elizabeth", "Diane", "Gericó", "Merlin", "Elaine"));
            add(new Questao("Nanatsu no Taizai. \n No final do Anime, por quem Clowther se apaixona?", R.id.rbResposta2,"Gericó", "Guila", "Elizabeth", "Merlin", "Vanessa"));
            add(new Questao("Nanatsu no Taizai. \n Ao sair da cadeia, qual foi a primeira pessoa que Ban encontra?", R.id.rbResposta1,"Gericó", "Hawk", "Meliodas", "Diane", "Elizabeth"));
            add(new Questao("Nanatsu no Taizai. \n Qual é o último pecado que Meliodas encontra?", R.id.rbResposta2,"Clowther", "Escanor", "Merlin", "Ban", "Diane"));
            add(new Questao("Nanatsu no Taizai. \n Quem é o porquinho que sempre acompanhou Meliodas?", R.id.rbResposta1,"Hawk", "Gilthunder", "Helbran", "King", "Hendrickson"));
            add(new Questao("Nanatsu no Taizai. \n Quem é a primeira pessoa que Meliodas enfrenta na Floresta dos sonhos brancos?", R.id.rbResposta1,"Gilthunder", "Diane", "Elizabeth", "Hawk", "Ban"));
            add(new Questao("Another. \n Qual foi a primeira pessoa a morrer?", R.id.rbResposta4,"Yukari Sakurag", "Izumi Akazawa", "Sr. Kubodera", "Misaki Fujioka", "Tomohiko Kazami"));
            add(new Questao("Another. \n como se acaba a calamidade?", R.id.rbResposta2,"Tirando o tapa-olho de Misaki.", "Mandando o Extra de volta para a morte.", "Encontrando um item de valor do morto que esta escondido na sala de aula.", "Trancando o aluno desprezado em um armário.", "Matando o aluno desprezado e depois queimar seus ossos."));
            add(new Questao("Another. \n Quem testemunhou a morte de Reiko?", R.id.rbResposta1,"Misaki Mei", "Kouichi Sakakibara", "Tatsuji Chibiki", "Katsumi Matsunaga", "Tomoka Inose"));
            add(new Questao("Another. \n Uma pessoa morreu na praia durante as férias.Como isso aconteceu?", R.id.rbResposta5,"Ele foi atropelado por uma lancha.", "Ele caiu de cima de um coqueiro.", "Ele morreu de asma.", "Ele morreu de ataque cardíaco.", "Ele desmaiou por uma forte dor de cabeça e morreu afogado."));
            add(new Questao("Another. \n Aonde Izumi Akazawa morreu?", R.id.rbResposta3,"Em casa.", "No colégio.", "Em um hotel.", "Em um ônibus.", "Em uma praia."));
            add(new Questao("Another. \n Em que lugar do colégio existe uma cadeira a menos?", R.id.rbResposta1,"Na sala dos professores.", "Na sala de aula.", "Na sala de música.", "Na quadra.", "Na biblioteca."));
            add(new Questao("Another. \n Por que Sakakibara foi para a cidade de Yomiama pela primeira vez?", R.id.rbResposta3,"Para frequentar a escola.", "Para conhecer a cidade.", "Para o enterro de sua tia.", "Para o enterro de sua mãe.", "Porque iria morar lá."));
            add(new Questao("Another. \n Como funcionava a calamidade depois que ela começa?", R.id.rbResposta5,"Um aluno morre a cada dia.", "Um morto ressuscita a cada mês.", "Um aluno morre a cada ano.", "Um morto ressuscita a cada dia.", "Um aluno morre a cada mês"));
            add(new Questao("Ao no Exorcist. \n Qual é o nome do irmão de Mephisto que veio do submundo?", R.id.rbResposta4,"Yukio", "Shura", "Rin", "Amaimon", "Bon"));
            add(new Questao("Ao no Exorcist. \n Qual é o nome do gato que o Rin e o Yukio adotam?", R.id.rbResposta2,"Mephisto", "Kuro", "Happy", "Biro", "Neko"));
            add(new Questao("Ao no Exorcist. \n Quem vira paladino no final?", R.id.rbResposta5,"Rin", "Shiemi", "Amaimon", "Kuro", "Yukio"));
            add(new Questao("Ao no Exorcist. \n Quem Satan possui no começo do anime?", R.id.rbResposta1,"Padre Fujimoto", "Yukio", "Shura", "Shiemi", "Mephisto"));
            add(new Questao("Ao no Exorcist. \n No OVA o que acontece?", R.id.rbResposta3,"Rin é possuido por satan", "Shiemi encontra o que ela quer", "Kuro foge", "Bon morre", "Mephisto morre"));
            add(new Questao("Ao no Exorcist. \n Que elemento Yukio e Rin se transformam para derrotar satan?", R.id.rbResposta4,"Ar", "Agua", "Terra", "Fogo", "Ferro"));
            add(new Questao("Ao no Exorcist. \n Que personagem sofreu na Noite Azul?", R.id.rbResposta2,"Shiemi", "Bon", "Rin", "Amaimon", "Padre Fujimoto"));
            add(new Questao("Ben 10. \n Quais são os parceiros de Ben 10?", R.id.rbResposta3,"Kevin e Vô Max", "Kevin e Gwen", "Vô Max e Gwen", "Bala de Canhão e Kevin", "Paradox e Vô Max"));
            add(new Questao("Ben 10. \n Qual é a maior inimiga(o) feiticeira(o) de Gwen?", R.id.rbResposta4,"Kevin", "Soberano", "Vilgax", "Encantriz", "Estrela Sombria"));
            add(new Questao("Ben 10. \n Qual é o outro nome do alien Cala Frio?", R.id.rbResposta1,"Friagem", "Anfíbio", "Frieira", "Arraia a Jato", "Atrópodes"));
            add(new Questao("Ben 10. \n Qual a transformação suprema do Macaco Aranha?", R.id.rbResposta2,"Pássaro Aranha", "Gorila Aranha", "Macaco Formiga", "Macaco Supremo", "Chipanzé Aranha"));
            add(new Questao("Ben 10. \n Quais os poderes do Arraia a Jato?", R.id.rbResposta4,"Congelar as pessoas", "Soltar fogo pela mão", "Aumentar de tamanho", "Soltar raio laser pelos olhos e pela calda", "Lançar diamantes"));
            add(new Questao("Ben 10. \n Qual o nome do criador do Ominitrix?", R.id.rbResposta1,"Azmuth", "Albido", "Vô Max", "Vilgax", "Malware"));
            add(new Questao("Ben 10. \n Qual é o parentesco de Ben e Gwen?", R.id.rbResposta5,"Não são parentes", "Namorados", "Primos de segundo grau", "Irmãos", "Primos"));
            add(new Questao("Beyblade. \n Qual foi a primeira pessoa que Gingka conheceu na cidade?", R.id.rbResposta5,"Madoka", "Benkei", "Kyoya", "Ryoma", "Kenta"));
            add(new Questao("Beyblade. \n Qual o ataque principal que Gingka usa com seu beyblade?", R.id.rbResposta2,"Ataque Dinamo Estelar", "Ataque Explosão Estelar", "Ataque Chuva Bey", "Ataque Unicórnio Galopante", "Ataque Ira do Dragão"));
            add(new Questao("Beyblade. \n Qual a imagem do Beyblade de Gingka?", R.id.rbResposta3,"Ferrari", "Cavalo", "Unicórnio", "Árvore", "Coração"));
            add(new Questao("Beyblade. \n Qual a amiga de Gingka do gênero feminino?", R.id.rbResposta1,"Madoka", "Kenta", "Kyoya", "Sakura", "Hyoga"));
            add(new Questao("Beyblade. \n Quem Gingka enfrenta no episódio 51?", R.id.rbResposta4,"Doji", "Kenta", "Benkei", "Ryuga", "Kyoya"));
            add(new Questao("Beyblade. \n O que também acontece no episódio 51?", R.id.rbResposta1,"O Beyblade de Gingka quebra", "Ele perde para Ryuga", "O pai de Gingka morre", "Kenta vira um Caça-Duelo", "Gingka ganha "));
            add(new Questao("Beyblade. \n Onde Gingka costumava brincar com Kenta e seus amigos?", R.id.rbResposta5,"No estádio Bey", "No campeonato organizado por eles", "Na sede dos Caça-Duelos", "Na casa de Kenta", "No Bey Park"));
            add(new Questao("Beyblade. \n Qual o nome do campeonato de Beyblade que foi o pedido de Yuuh após ganhar o campeonato?", R.id.rbResposta1,"Bladers de Batalha", "Combate Bey", "Bey Park Combat", "Bey Park Show", "Campeonato Beyblade"));
            add(new Questao("Bleach. \n Qual o nome do boneco de Ichigo?", R.id.rbResposta4,"Sado", "Aizen", "Renji", "Kon", "Ichigozinho"));
            add(new Questao("Bleach. \n Itegumo é a Zanpakutou de quem?", R.id.rbResposta2,"Ikkaku", "Isane", "Urahara", "Gin", "Hinamori"));
            add(new Questao("Bleach. \n Qual é a Zanpakutou mais forte do elemento gelo?", R.id.rbResposta5,"Benihime", "Haineko", "Tobiume", "Nejibana", "Hyounimaru"));
            add(new Questao("Bleach. \n Quem era o Rei do Hueco Mundo antes de Aizen?", R.id.rbResposta4,"Tousen", "Stark", "Gin", "Barragan", "Shinji"));
            add(new Questao("Bleach. \n Qual único Espada que possui segunda etapa de sua ''ressureción''?", R.id.rbResposta1,"Ulquiorra", "Yammy", "Halibel", "Aizen", "Aaroniero"));
            add(new Questao("Bleach. \n O que aconteceu com Ichigo após usar o Mugetsu?", R.id.rbResposta3,"Ficou com um grande poder", "Morreu", "Perdeu seus poderes Shinigami", "Se transformou em hollow", "Matou todos com o seu poder espiritual"));
            add(new Questao("Bleach. \n O que a Zanpakutou Wabisuke(Kira Izuru) faz?", R.id.rbResposta1,"Dobra o peso de tudo que toca", "Lança bolas de fogo", "Deixa Kira Izuru com muito mais velocidade", "Congela qualquer coisa", "Se transforma em fumaça e corta tudo em que toca"));
            add(new Questao("Bleach. \n Qual única arma que os Quincy usam?", R.id.rbResposta5,"Lanças", "Martelos", "Espadas", "Facas", "Arcos"));
            add(new Questao("Bleach. \n Qual a cor do cabelo de Ichigo ao usar o Mugetsu?", R.id.rbResposta3,"Rosa", "Laranja", "Preto", "Branco", "Castanho"));
            add(new Questao("Bleach. \n Qual nome da Zanpakutou de Hisagi Shuuhei?", R.id.rbResposta4,"Tachikaze", "Zangetsu", "Shinsou", "Kazeshini", "Zabimaru"));
            add(new Questao("Code Geass. \n Qual o poder do Geass de Lelouch?", R.id.rbResposta1,"Obediência Absoluta", "Ler pensamentos", "Parar o Tempo", "Empossar-se de pessoas", "Viajar no Tempo"));
            add(new Questao("Code Geass. \n Qual o nome da Instituição que Zero fundou?", R.id.rbResposta5,"União das Federações Unidas", "Kishidan", "Ordem dos Cavaleiros das Trevas", "Kaname Oghi", "Ordem dos Cavaleiros Negros"));
            add(new Questao("Code Geass. \n Depois da invasão do Santo Império da Britannia ao Japão, como o mesmo passou a se chamar?", R.id.rbResposta2,"Área 12", "Área 11", "Área 18", "Novo Japão", "Colônia do Santo Império Britânico"));
            add(new Questao("Code Geass. \n Quem era o maior rival de Lelouch?", R.id.rbResposta3,"Sua irmã, Cornellia", "Seu pai, Charlles", "Seu irmão, Scheneizel", "Seu amigo, Rollo", "Seu tio, Andrew"));
            add(new Questao("Code Geass. \n O knightmare de Lelouch, Shinkiro, era especializadamente focado em:", R.id.rbResposta2,"Contra Ataque Poderoso", "Sistema de Defesa Absoluta", "Sistema de voo", "Sistema de Longa distância", "Sistema de curta distância"));
            add(new Questao("Code Geass. \n Zero teve a necessidade de criar um país para sua instituição. Qual era o nome do país?", R.id.rbResposta3,"União das Federações", "Bloco Europeu", "Estados Unidos do Japão", "Nafta", "União Europeia"));
            add(new Questao("D.Gray-Man. \n Qual é o nome do irmão de Lenalee?", R.id.rbResposta3,"Lavi", "Allen", "Komui", "Tap", "Bak"));
            add(new Questao("D.Gray-Man. \n Existem akumas de nível 1, nível 2, nível 3 e nível 4. Quantos akumas de nível 4 aparecem no anime?", R.id.rbResposta1,"1", "2", "3", "4", "5"));
            add(new Questao("D.Gray-Man. \n A inoscência de Krory é do tipo parasita. Em qual parte de seu corpo fica sua inoscência?", R.id.rbResposta5,"No braço, como a de Allen", "A inoscência de Krory não é do tipo parasita, e sim do tipo equipamento", "Krory não é um exorcista", "Nas mãos, em seus dedos", "Na boca, em seus dentes"));
            add(new Questao("D.Gray-Man. \n O que Lavi é?", R.id.rbResposta1,"Aprendiz de Book Man Junior", "Aprendiz de violino", "Faxineiro", "Cozinheiro", "Mordomo"));
            add(new Questao("D.Gray-Man. \n O que General Cross é de Allen?", R.id.rbResposta3,"Amigo", "Irmão", "Mestre", "Tio", "Pai"));
            add(new Questao("D.Gray-Man. \n Quantos anos Allen Walker tem?", R.id.rbResposta3,"14", "16", "15", "18", "20"));
            add(new Questao("D.Gray-Man. \n Em qual dos intrumetnos a seguir Allen toca a melodia do 14º?", R.id.rbResposta3,"Harpa", "Violino", "Piano", "Teclado", "Allen não toca nenhum instrumento"));
            add(new Questao("D.Gray-Man. \n Qualo o grau de parentesco entre Allen Walker e Yuu Kanda?", R.id.rbResposta5,"Irmãos", "Tio e Sobrinho", "Pai e filho", "Avô e neto", "Kanda e Allen não são parentes"));
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        getSupportActionBar().hide();
        Collections.shuffle(questoes);

        pergunta = (TextView)findViewById(R.id.pergunta);
        rbResposta1 = (RadioButton)findViewById(R.id.rbResposta1);
        rbResposta2 = (RadioButton)findViewById(R.id.rbResposta2);
        rbResposta3 = (RadioButton)findViewById(R.id.rbResposta3);
        rbResposta4 = (RadioButton)findViewById(R.id.rbResposta4);
        rbResposta5 = (RadioButton)findViewById(R.id.rbResposta5);
        carregarQuestao();
    }

    private void carregarQuestao(){

        if(cont < 10) {
            Questao q = questoes.remove(0);
            pergunta.setText(q.getPergunta());
            List<String> resposta = q.getRespostas();
            rbResposta1.setText(resposta.get(0));
            rbResposta2.setText(resposta.get(1));
            rbResposta3.setText(resposta.get(2));
            rbResposta4.setText(resposta.get(3));
            rbResposta5.setText(resposta.get(4));
            respostaCerta = q.getRespostaCerta();
            cont++;
        }
        else{
            Intent intent = new Intent(this, RespostaActivity.class);
            intent.putExtra("pontos", pontos);
            startActivity(intent);
            finish();
        }
    }

    public void btnResponderOnClick(View v){
        rgRespostas = (RadioGroup)findViewById(R.id.rgRespostas);
        rb = (RadioButton)findViewById(rgRespostas.getCheckedRadioButtonId());
        Intent intent = new Intent(this, RespostaActivity.class);
        if(rgRespostas.getCheckedRadioButtonId() == respostaCerta) {
            intent.putExtra("acertou", true);
            pontos++;
        }
        else intent.putExtra("acertou", false);
        intent.putExtra("pontos", pontos);
        startActivity(intent);
        rb.setChecked(false);
    }


    @Override
    protected void onRestart(){
        super.onRestart();
        carregarQuestao();
    }
    public void btnJogarNovamenteOnClick(View v){
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
        finish();
    }
}
