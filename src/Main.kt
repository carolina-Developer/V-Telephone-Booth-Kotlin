fun main() {

    //creacion de cabina
    val cabina = Cabina(1)
    val cabina_dos = Cabina(3)

    //Registrar cabina
    cabina.registrarLlamada(tipo_llamada = TipoLlamada.LOCAL, 3213109543, 10)
    cabina.registrarLlamada(tipo_llamada = TipoLlamada.LARGA_DISTANCIA, 3058761595, 5)
    cabina_dos.registrarLlamada(tipo_llamada = TipoLlamada.LARGA_DISTANCIA, 313388631, duracion = 30)

    //Mostrar informacion de la cabina correspondiente
    cabina.mostrarInformacionCabina()
    cabina_dos.mostrarInformacionCabina()

    //Enlazar cabina a la lista de cabinas para mostrar consolidado
    val cabinas: MutableList<Cabina> = mutableListOf()
    cabinas.add(cabina)
    cabinas.add(cabina_dos)

    val reporte = gestionCabina(cabinas)
    reporte.mostrarConsolidado()

    //Reiniciar cabina
    cabina.reiniciarCabina()

    //Mostrar informacion de la cabina
    cabina.mostrarInformacionCabina()

}
/*    var opcion: Int
    var tipoLlamada : TipoLlamada
    var nroCabina: Int
    var opcTipoLlamada: Int
    var nroDestino: Long
    var duracionLlamada: Int

    do {
        println("\n--- Menú Principal ---")
        println("1. Registrar llamada")
        println("2. Información general de la cabina")
        println("3. Reiniciar cabina")
        println("4. Consolidado total")
        println("5. Salir")
        print("Seleccione una opción: ")

        opcion = readln().toInt()

        when (opcion) {
            1 -> {

                println("Ingrese el nro de la cabina")
                nroCabina = readln().toInt()
                if (nroCabina >5) println("Opción no válida. Por favor, seleccione 1, 2, 3, 4, 5, o 6")

                println("""
                    Ingrese tipo de Llamada:
                    1. Local
                    2. Larga distancia
                    3. Celular
                """.trimIndent())
                opcTipoLlamada = readln().toInt()


                when (opcTipoLlamada) {
                    1 ->  tipoLlamada = TipoLlamada.LOCAL
                    2 -> tipoLlamada = TipoLlamada.LARGA_DISTANCIA
                    3 -> tipoLlamada = TipoLlamada.CELULAR
                    else -> println("Opción no válida. Por favor, seleccione 1, 2 o 3.")
                }

                println("Ingrese el numero de celular al que quiere llamar")
                nroDestino = readln().toLong()

                println("Ingrese la duracion de la llamada")
                duracionLlamada = readln().toInt()

                val cabina = Cabina(nroCabina)
                cabina.registrarLlamada(tipo_llamada = tipoLlamada, nroDestino, duracionLlamada)

            }
            2 -> informacionGeneral()
            3 -> reiniciarCabina()
            4 -> consolidadoTotal()
            5 -> println("Saliendo del programa...")
            else -> println("Opción no válida. Por favor, intente de nuevo.")
        }
    } while (opcion != 5)*/