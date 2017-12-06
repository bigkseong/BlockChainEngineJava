
public class BlockchainUI {
	private BlockchainService bls;
	
	public BlockchainUI(BlockchainService bls) {
		this.bls = bls;
	}

	public void mining() {
		
		Blockchain bc = bls.getBlockchain();
		Block newBlock = bls.generateNewBlock();
		Block minedBlock = bls.mining(Block);
		if(bls.successMining()){
			sysout.println("mining success");
		}
		else{
			sysout.println("mining fail");
		}		
	}

	public AbstractTransaction makeTransaction(TransactionCreator txCreator, Object data) {
		return bls.createTransaction(txCreator, data);
	}

	public void observeBlockchain() {
		Blockchain bc = bls.getBlockchain();
		sysout.println(bc.showBlockChain);
	}

	public void createGenesisBlock() {
		Block genesisblock = new Block();
		Blockchain = bls.createNewBlockchain();
		SimpleBlockchain = bls.createNewBlockchain(genesisblock, 50);
		
	}
}
