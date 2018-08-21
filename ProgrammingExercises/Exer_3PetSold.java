public class Exer_3PetSold extends Exer_3DemoItemsAndPets {

        private boolean isVaccinated;
        private boolean isNeutered;
        private boolean isHousebroken;
        private void setIsVaccinated(boolean isVac)
        {
            isVaccinated = isVac;
        }
        public void setIsNeutered(boolean isNeut)
        {
            isNeutered = isNeut;
        }
        public void setIsHousebroken(boolean isHb)
        {
            isHousebroken = isHb;
        }
        public boolean getIsVaccinated()
        {
            return isVaccinated;
        }
        public boolean getIsNeutered()
        {
            return isNeutered;
        }
        public boolean getIsHousebroken()
        {
            return isHousebroken;
        }
    }
