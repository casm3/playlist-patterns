package com.playlist.composite;

import com.playlist.core.Track;
import java.util.List;

/**
 * Folha do padrão Composite: envolve uma única {@link Track}.
 */
public class TrackItem implements MediaItem {

  /**
   * Cria a folha a partir de uma faixa.
   *
   * @param track faixa envolvida. Não pode ser nula.
   * @throws IllegalArgumentException se {@code track} for nula.
   */
  public TrackItem(Track track) {
    throw new UnsupportedOperationException("Exercício 1: implemente o construtor de TrackItem");
  }

  /**
   * Devolve a faixa envolvida por esta folha.
   *
   * @return a faixa original.
   */
  public Track getTrack() {
    throw new UnsupportedOperationException("Exercício 1: implemente TrackItem.getTrack");
  }

  @Override
  public String getName() {
    throw new UnsupportedOperationException("Exercício 1: implemente TrackItem.getName");
  }

  @Override
  public int getDurationSeconds() {
    throw new UnsupportedOperationException("Exercício 1: implemente TrackItem.getDurationSeconds");
  }

  @Override
  public int getTrackCount() {
    throw new UnsupportedOperationException("Exercício 1: implemente TrackItem.getTrackCount");
  }

  @Override
  public List<Track> flatten() {
    throw new UnsupportedOperationException("Exercício 1: implemente TrackItem.flatten");
  }
}
