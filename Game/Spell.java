public abstract  class Spell {
        int paguba;
        int manaAbilitate;
        public int getRandomNumber(int min, int max) {
            return (int) ((Math.random() * (max - min)) + min);
        }
}
