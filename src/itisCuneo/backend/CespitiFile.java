package itisCuneo.backend;

import com.google.gson.Gson;

import java.io.*;

public class CespitiFile implements IExports {


    @Override
    public void scriviCsv(ElencoCespiti elencoCespiti) {
        File fileCsv = new File(PATH + NAME_CSV);
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            fw = new FileWriter(fileCsv);
            bw = new BufferedWriter(fw);
            for(Cespiti cespiti : elencoCespiti){
                bw.write(cespiti.toCsv());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }




    @Override
    public void scriviJson(ElencoCespiti elencoCespiti) {
         Gson gSon = new Gson();
         String json = gSon.toJson(elencoCespiti);
        File fileCsv = new File(PATH + NAME_JSON);
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            fw = new FileWriter(PATH + NAME_JSON);
            bw = new BufferedWriter(fw);
            bw.write(json);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
