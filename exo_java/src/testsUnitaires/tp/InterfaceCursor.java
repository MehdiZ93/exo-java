package testsUnitaires.tp;

/**
 * Repr�sente un object mobile dans le plan.
 */

public interface InterfaceCursor
{
        /**
         * Retourne la position de l'objet.
         */
        public InterfacePoint getPosition();

        /**
         * Retourne la direction vers laquelle l'objet est tourn�.
         */
        public InterfacePoint getDirection();

        /**
         * Restaure la position � 0 et la direction � (1, 0)
         */

        /**
         * D�termine la position de l'objet.
         */
        public void setPosition(InterfacePoint position);

        /**
         * D�termine la direction vers laquelle l'objet est tourn�.
         */
        public void setDirection(InterfacePoint direction);

        /**
         * Restaure la position � 0 et la direction � (1, 0)
         */
        public void reset();

        /**
         * Fait avancer le mobile d'un pas dans la direction dans laquelle
         * il est tourn�.
         */
        public void stepStraigth();

        /**
         * Fait pivoter l'objet d'un quart de tour vers la gauche.
         */
        public void turnLeft();

        /**
         * Fait pivoter l'objet d'un quart de tour vers la droite.
         */
        public void turnRight();
}