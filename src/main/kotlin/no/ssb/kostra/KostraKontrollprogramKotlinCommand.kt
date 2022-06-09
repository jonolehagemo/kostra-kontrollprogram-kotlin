package no.ssb.kostra

import io.micronaut.configuration.picocli.PicocliRunner
import io.micronaut.context.ApplicationContext

import picocli.CommandLine
import picocli.CommandLine.Command
import picocli.CommandLine.Option
import picocli.CommandLine.Parameters

@Command(name = "kostra-kontrollprogram-kotlin", description = ["..."],
        mixinStandardHelpOptions = true)
class KostraKontrollprogramKotlinCommand : Runnable {

    @Option(names = ["-v", "--verbose"], description = ["..."])
    private var verbose : Boolean = false

    override fun run() {
        // business logic here
        if (verbose) {
            println("Hi!")
        }
    }

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            PicocliRunner.run(KostraKontrollprogramKotlinCommand::class.java, *args)
        }
    }
}
