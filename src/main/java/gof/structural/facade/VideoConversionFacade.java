package gof.structural.facade;

public class VideoConversionFacade {
    public VideoFile convertVideo(String fileName, String format) {
        VideoFile videoFile = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(videoFile);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        final VideoFile buffer = BitrateReader.read(videoFile, sourceCodec);
        final VideoFile convertedFile = BitrateReader.convert(buffer, destinationCodec);
        System.out.println("VideoConversionFacade: conversion completed.");
        return convertedFile;
    }
}
