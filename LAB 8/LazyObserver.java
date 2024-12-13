public interface LazyObserver {
    void update(boolean queroDesconto);
    void solicitarUpdate(Emissor e);
}
