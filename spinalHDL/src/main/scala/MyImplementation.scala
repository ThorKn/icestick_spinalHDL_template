import spinal.core._
import spinal.core.sim._
import spinal.lib._
import spinal.lib.fsm._

class MyImplementation extends Component{
    val io = new Bundle{
        val out1 = out Bool()
        val in1  = in  Bool()
    }

    io.out1 := ~io.in1
}

object MyImplementationMain{
    def main(args: Array[String]) {
        SpinalConfig(
            mode = Verilog,
            defaultClockDomainFrequency = FixedFrequency(12 MHz)
        ).generate(new MyImplementation)

        // val spinalConfig = SpinalConfig(defaultClockDomainFrequency = FixedFrequency(12 MHz))

        // SimConfig
        //     .withConfig(spinalConfig)
        //     .withWave
        //     .compile(new LedClock)
        //     .doSim{ myimpl =>
        //         myimpl.clockDomain.forkStimulus(2)
        //         var idx = 0
        //         while(idx < 1000000){
        //             myimpl.clockDomain.waitSampling()
        //             idx += 1
        //         }
        //     }
    }
}