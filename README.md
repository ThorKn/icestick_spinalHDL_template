# icestick_spinalHDL_template
A template for starting a spinalHDL project targeted at the Lattice icestick FPGA.

### Create Verilog from spinalHDL

```
cd spinalHDL
sbt "runMain MyImplementation"
cd ..
```
### Copy Verilog over into the icestick folder
```
cp spinalHDL/MyImplementation.v icestick/
```

### Create bitstream from Verilog and flash to icestick
```
cd icestick
make prog
```

