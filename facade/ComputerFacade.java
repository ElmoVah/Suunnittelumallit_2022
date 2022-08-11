package facade;

public class ComputerFacade {
	private CPU cpu;
	private HardDrive hardDrive;
	private Memory memory;
	
	private int kBootAddress = 0;
	private int kBootSector = 0;
	private int kSectorSize = 26;
	
	public ComputerFacade(){
		cpu = new CPU();
		hardDrive = new HardDrive();
		memory = new Memory();
	}
	
	public void Start() {
		cpu.Freeze();
		memory.load(kBootAddress, hardDrive.Read(kBootSector, kSectorSize));
		cpu.Jump(kBootAddress);
		cpu.Excecute();
	}

}
