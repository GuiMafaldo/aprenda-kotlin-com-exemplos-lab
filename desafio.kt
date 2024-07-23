// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.nome} foi matriculado na formação $nome.")
    }
}

fun main() {
    // Criando usuários
    val usuario1 = Usuario("Guilherme")
    val usuario2 = Usuario("Maria")
    val usuario3 = Usuario("João")

    // Criando conteúdos educacionais
    val conteudo1 = ConteudoEducacional("Kotlin Básico", 120)
    val conteudo2 = ConteudoEducacional("Kotlin Intermediário", 180)
    val conteudo3 = ConteudoEducacional("Kotlin Avançado", 240)

    // Criando formações
    val formacao1 = Formacao("Formação Kotlin", Nivel.BASICO, listOf(conteudo1, conteudo2))
    val formacao2 = Formacao("Formação Kotlin Avançado", Nivel.DIFICIL, listOf(conteudo3))

    // Matriculando usuários nas formações
    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)
    formacao2.matricular(usuario3)

    // Exibindo inscritos em cada formação
    println("Inscritos na ${formacao1.nome}:")
    formacao1.inscritos.forEach { println(it.nome) }

    println("Inscritos na ${formacao2.nome}:")
    formacao2.inscritos.forEach { println(it.nome) }
}

