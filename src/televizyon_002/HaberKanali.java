package televizyon_002;

public class HaberKanali extends Kanal {

	public HaberKanali(String kanalAdi, int kanalNo) {
		super(kanalAdi, kanalNo);

	}

	@Override
	public String toString() {

		return "HaberKanali\n[Kanal ADI:" + getKanalAdi() + ", Kanal No:" + getKanalNo() + "]";

	}

}