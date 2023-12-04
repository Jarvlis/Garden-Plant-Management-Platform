package org.plants.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PestControlStrategy {
    private int strategieId;
    private int plantId;
    private int preventionId;

    public int getStrategieId() {
        return strategieId;
    }

    public void setStrategieId(int strategieId) {
        this.strategieId = strategieId;
    }

    public int getPlantId() {
        return plantId;
    }

    public void setPlantId(int plantId) {
        this.plantId = plantId;
    }

    public int getPreventionId() {
        return preventionId;
    }

    public void setPreventionId(int preventionId) {
        this.preventionId = preventionId;
    }
}
