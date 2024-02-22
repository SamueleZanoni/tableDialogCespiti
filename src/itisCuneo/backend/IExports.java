package itisCuneo.backend;

public interface IExports {

    public static final String PATH = "data/";
    public static final String NAME_JSON = "Cespite.json/";
    public static final String NAME_CSV = "Cespite.csv/";

    public void scriviCsv(ElencoCespiti elencoCespiti);

    public void scriviJson(ElencoCespiti elencoCespiti);

}
